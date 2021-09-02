# d일반적인 순수 재귀
def recur1(n : int ) -> int:
    if n > 0 : 
        recur1(n-1)
        print(n)
        recur1(n-2)

x = int(input('정수값을 입력하세요'))
recur1(x)