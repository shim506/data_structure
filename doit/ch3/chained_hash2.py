from __future__ import annotations
from typing import ChainMap, Sequence , Any
import hashlib

# 찾기 , 보여주기 , 삭제 , 추가

class Node:
    def __init__(self , key:Any , value:Any , next : Node) -> Any:
        self.key  =  key
        self.value = value
        self.next = next

class ChaninedHash:
    def __init__(self , capacity : int ) -> None:
        self.capcity = capacity
        self.table = [None]*self.capcity
    
    def hash_value(self, key:any) -> int:
        if isinstance(key , int):
            return key % self.capcity
        return (int(hashlib.sha256(str(key).encode()).hexdigest(),16)%self.capcity)
    
    def search(self, key:Any) -> Any:
        hash = self.hash_value(key)
        p = self.table[hash]
        while p is not None:
            if p.key == key:
                return p.value
            p = p.next
        return None

    def add(self, key:Any , value:Any) -> bool:
        hash = self.hash_value(key)
        p = self.table[hash]
        
        # 중복 검사가 필요하다
        while p is not None:
            if p.key == key:
                return False
            p = p.next

        #p를 그대로 넣었을때는 앞에께 누락 됬지만 self.table[hash] 로 넣으니깐 잘됨
        newNode = Node(key , value ,  self.table[hash])
        self.table[hash] = newNode
        return True


    def delete(self, key:Any) -> bool:
        hash = self.hash_value(key)
        
        p = self.table[hash]
        pp = None

        while p is not None:
            if self.key == key:
                if pp is None:
                    self.table[hash] = p.next
                else:
                    pp.next = p.next
                return True
            pp = p
            p = p.next
        return False
    
    def dump(self):
        for i in range(self.capcity):
            p = self.table[i]
            print(i , end="")
            while p is not None:
                print(f' -> {p.key}({p.value})' ,end="")
                p = p.next
            print()

#추가혹은 dump 의 문제이다

hashmap = ChaninedHash(10)
hashmap.add(10 , 10)
hashmap.add(0 , 0)
hashmap.add(1 , 1)
hashmap.add(2 , 2)
hashmap.dump()



