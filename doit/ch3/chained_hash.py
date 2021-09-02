from __future__ import annotations
# annotations 을 가장 나중에 실행 할 수 있게끔함
from typing import Sequence , Any
import hashlib


class Node:

    def __init__(self , key:Any , value : Any, next : Node) -> None:
        self.key = key 
        self.value = value
        self.next = next #뒷쪽 노드를 참조

class ChaninedHash:
    # capacity 는 해시테이블의 크기 (table 의 원소 수)를 의미함
    def __init__(self , capacity:int) -> None:
        self.capacity = capacity
        self.table = [None]*self.capacity       #capacity 크기만큼 빈리스트 미리 생성

    def hash_value(self , key:Any) -> int:  
        if isinstance(key , int):
            return key % self.capacity
        # key가 int 형이 아닌경우 다음과 같은 방법으로 int형으로 바꾸어준다
        return(int(hashlib.sha256(str(key).encode()).hexdigest(),16)%self.capacity)
    
    def add(self , key:Any ,value: Any) -> bool:
        hash = self.hash_value(key)             # 추가하는 key의 해시값
        p = self.table[hash]                    # 노드 주목
        
        while p is not None:                    # 최초값이 none 이거나 next가 비어있는 값을 찾을때까지 내려감
            if p.key == key:
                return False                    # 중복되는 키값은 허용하지 않는다
            p = p.next

        temp = Node(key , value , self.table[hash]) # 기존의 노드를 새로 추가할 값의 next로 설정함으로써 
        self.table[hash] = temp                     # 해당 인덱스의 체인 가장 상단에 값이 추가된다.
        return True

    def search(self , key:Any) -> Any:
        hash = self.hash_value(key)
        p = self.table[hash]

        while p is not None:
            if p.key == key:
                return p.value
            p = p.next
        return None
    
    def remove(self , key:Any) -> bool:
        hash = self.hash_value(key)
        p = self.table[hash]            #노드 주목
        pp = None                       #바로 앞의 노드를 주목(위에서 부터 선형 탐색이기때문에 처음엔 None)

        while p is not None:
            if p.key == key:
                if pp is None:
                    self.table[hash] = p.next
                else:
                    pp.next = p.next                
                return True
            pp = p
            p=p.next
        return False
    
    def dump(self) -> None:
        for i in range(self.capacity):
            p = self.table[i]
            print(i , end='')
            while p is not None:
                print(f' -> {p.key}({p.value})' , end="")
                p = p.next
            print()

hash  = ChaninedHash(13)
hash.add(10,10)
hash.add(1,"ddd")
hash.add(24 , 24)
hash.add(14 ,14)
hash.dump()