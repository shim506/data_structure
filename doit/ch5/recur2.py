# 꼬리 재귀 수정
# 기존에 recur1(n-2) 는 n을 -2 해서 인수로 recur 함수를 호출 하는 것이었다.
# 여기서 꼬리 재귀를 삭제하기 위해서
# 값을 직접 수정해주고 while 문을 통해 다시 recur2(n-1) 로 시작할 수 있게 바꾸어 줄 수 있다.

def recur2( n : int )-> int:
    while n > 0 : 
        recur2(n -1)
        print(n)
        n = n-2

x = int(input('정수값을 입력하세요'))
recur2(x)