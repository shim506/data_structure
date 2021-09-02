from __future__ import annotations
from typing import ChainMap, Sequence , Any
from enum import Enum
import hashlib

class Status(Enum):
    OCCUPIED = 0
    EMPTY =1
    DELETED =2

#값이 있는지 없는지를 확인할뿐 아니라 삭제됨까지 표시 하기 위해 status를 만들었다 이유는??

class Bucket:

    def __init__(self , key:Any = None , value:Any = None ,stat :Status = Status.EMPTY) -> None:
        self.key = key
        self.value = value
        self.stat = stat
    def set(self , key:Any , value:Any ,stat:Status )-> None:
        self.key = key
        self.value = value
        self.stat = stat
    def set_status(self , stat :Status) ->None:
        self.stat = stat
    
class OpenHash:
    def __init__(self , capacity: int) -> None:
        self.capacity = capacity
        # 링크법과는 다르게 존재 유무 뿐 아니라 status를 통해 삭제됨 까지 확인해야하므로
        # 단순한 [None] 배열로 생성하지 않는다
        self.table = [Bucket()]*self.capacity
    
    def hash_value(self , key:Any) -> int:
        if isinstance(key , int):
            return key % self.capacity
        return (int(hashlib.md5(str(key).encode()).hexdigest(),16)%self.capacity)

    def rehash_value(self , key:Any) -> int:
        # 재 해쉬에는 다양한 방법이있고 여기서는 1을 더해서 다시 나눈다
        return(self.hash_value(key)+1)%self.capacity
    
    def search_node(self, key:Any)  -> Any:
        hash =self.hash_value(key)
        p = self.table[hash]

        for i in range(self.capacity):
            if p.stat == Status.EMPTY:
                break
            elif p.stat== Status.OCCUPIED and p.key == key:
                return p
            hash = self.rehash_value(hash)
            p = self.table[hash]
        return None
    
    def search(self , key:Any) -> Any:
        p = self.search_node(key)
        if p is None:
            return None
        return p.value
    
    def add(self , key:Any , value:Any) -> bool:
        # 이미 존재하는 key 값
        if self.search(key) is not None:
            return False

        hash = self.hash_value(key)
        p = self.table[hash]
        for i in range(self.capacity):
            if p.stat != Status.OCCUPIED:
                self.table[hash] = Bucket(key , value ,Status.OCCUPIED)
                return True
            hash = self.rehash_value(hash)
            p = self.table[hash]
        # 꽉참
        return False 
    
    def remove(self , key: Any) -> int:
        p = self.search_node(key)
        if p is not None:
            p.set_status(Status.DELETED)
            return True
        return False

    
    def dump(self) -> None:
        for i in range(self.capacity):
            print(f'{i}번' , end='')
            p = self.table[i]
            if p.stat == Status.OCCUPIED:
                print(f'{p.key}({p.value})')
            elif p.stat == Status.EMPTY:
                print("  미등록")
            else:
                print("  삭제됨")

hash = OpenHash(13)
hash.add(10,10)
hash.add(1,1)
hash.add(15,15)
hash.remove(15)
hash.add(14,14)
hash.add(3,3)
hash.remove(3)
hash.dump()
print(hash.search(11))