from fixed_stack import Fixed_stack

def recur(n : int ) -> int:
    stack = Fixed_stack(n)

    while True :
        if(n > 0) : 
            stack.push(n)
            n = n-1
            continue
        
        if not stack.is_empty():
            n = stack.pop()
            print(n)
            n = n-2
            continue
        break
x = int(input("정수값을 입력하세요"))

recur(x)

    
