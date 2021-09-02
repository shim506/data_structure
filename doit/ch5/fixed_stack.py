from typing import Any

class Fixed_stack:
    class Empty(Exception):
        def __init__(self, *args: object) -> None:
            super().__init__("스택이 비어 있습니다")
        #비어있는 스택에 대해서 pop 예외처리
        #print("스택이 비어있습니다")
    class Full(Exception):
        def __init__(self, *args: object) -> None:
            super().__init__("스택이 꽉 차 있습니다")
        #꽉찬 스택에 대해서 push 예외처리
        #print("스택이 꽉찼습니다")
    
    
    # ptr 값에 대해 주의
    # ptr 값은 0 부터 시작하기 때문에 결국 마지막으로 존재하는 값(차있는 값) 은 ptr-1 이다
    
    # pop 이나 clear 를 할때 실제로 값은 지우지 않고 ptr 만 바꾸어도 된다
    # ptr 이상의 자리 값들은 peek 가 불가능하며 pop 이 언제든 가능하기 때문이다.
    def __init__(self , capacity :int = 256) -> None:
        self.capacity = capacity
        self.stk  = [None]*capacity
        self.ptr = 0

    def __len__(self) -> int:
        return self.ptr
    
    def is_empty(self) -> bool:
        return self.ptr <= 0
    
    def is_full(self) ->bool:
        return self.ptr >= self.capacity
    
    def push(self , value : Any) -> None:
        if self.is_full():
            raise Fixed_stack.Full
        self.stk[self.ptr] = value
        self.ptr += 1

    def pop(self )  -> Any:
        if self.is_empty():
            #print("스택이 비어 있음")
            #return
            raise Fixed_stack.Empty
        self.ptr -= 1
        return self.stk[self.ptr]
    
    def peek(self) -> Any:
        if self.is_empty():
            raise Fixed_stack.Empty
        return self.stk[self.ptr-1]
    
    def clear(self) -> None:
        self.ptr = 0

    # 선입 선출 개념을 적용해서 큰인덱스 부터의 탐색이 필요하다
    def find(self , value:Any)->int:
        for i in range(self.ptr-1 , -1 ,-1):
            if self.stk[i] == value:
                return i
        return -1
    
    def count(self , value:Any)-> int:
        index = self.find(value)
        return self.stk - index
    
    def __contains__(self , value: Any) -> bool:
        if self.find(value) == -1:
            return False
        return True
    
    def dump(self) -> None:
        if self.is_empty():
            raise Fixed_stack.Empty
        else:
            print(self.stk[:self.ptr])
        #for i in range(self.ptr-1 , -1 ,-1):
            #print(self.stk[i])

if __name__ == "__main__" : 
    stack = Fixed_stack(15)
    stack.pop()
    stack.push(19)
    print(stack.peek())
    stack.push(25)
    stack.push(37)
    stack.push(53)
    print(stack.peek())
    stack.pop()
    stack.dump()
    x = 19
    print(x in stack)
    print(len(stack))
                