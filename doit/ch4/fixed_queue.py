from typing import Any

class Fixed_queue:
    class Empty(Exception):
        def __init__(self, *args: object) -> None:
            super().__init__("큐가 비어 있습니다")
       
    class Full(Exception):
        def __init__(self, *args: object) -> None:
            super().__init__("큐가 꽉 차 있습니다")
      
    
    def __init__(self , capacity:int) -> None:
        # front 는 값이 존재 하는 공간을 가리키고
        # rear 는 값이 새로들어갈 공간 즉 빈 공간을 가리킨다
        self.capacity = capacity
        self.front = 0
        self.rear = 0
        self.que = [None]*capacity
        # 현재 데이터 개수
        self.no =0
    
    def __len__(self ) -> int:
        return self.no
    
    def is_empty(self) -> bool:
        return self.no <= 0
    
    def is_full(self) ->bool:
        return self.no >= self.capacity

    def enque(self , x:Any) -> None:
        if self.is_full:
            raise Fixed_queue.Full
        self.que[self.rear] = x
        self.rear +=1
        self.no += 1
        if self.rear == self.capacity:
            self.rear = 0
    def deque(self) -> None:
        if self.is_empty:
            raise Fixed_queue.Empty
        x = self.que[self.front]
        self.front += 1
        self.no -= 1
        if self.front == self.capacity :
            self.front = 0
        return x

    def peek(self) -> None:
        if self.is_empty :
            raise Fixed_queue.Empty
        return self.que[self.front]
    
    def find(self , value: Any)  -> int:
        for i in range(self.no):
            idx = (i + self.front) % self.capacity 
            if self.que[idx] == value:
                return i
        return -1
    
    # value 는 중복이 가능하기 때문에
    # 원하는 value 가 que 에 몇개 있는지를 반환하는 함수
    def count(self , value : int) -> int :
        cnt = 0
        for i in range(self.no):
            idx =  (i + self.front) % self.capacity
            if value == self.que[idx]:
                cnt +=1
        return cnt
    
    def __contains__(self , value:int) -> bool:
        return self.count(value)
    def clear(self) -> None:
        self.no = self.rear = self.front =  0
    def dump(self) -> None:
        if self.is_empty():
            print("큐가 비어있습니다")
        else:
            for i in range(self.no):
                print(self.que[i+self.front % self.capacity] ,end="")
                print()


que = Fixed_queue(20)
que.enque(20)
que.enque(10)
que.enque(5)
que.dump()


        
    