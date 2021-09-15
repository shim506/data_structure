# z
# 원하는 위치까지 함수가 받드시 순서대로 호출된다는 점에서
# result 를 1씩 증가시켜도 해당 위치의 실행 순서 값을 구해낼 수 있다.
# 예를 들면 (0,4)가 실행되려면 왼쪽의 [2X2] 블럭이 모두 실행된 다음 두번째 solve 함수에서
# result 값을 부르므로 count가 순서와 일치하게됨
# global 함수로 선언함으로써 온전히 적층 될 수 있게함

# 분할정복으로 풀면 시간 초과가 난다....

import sys


def solve(size , x, y ):
    global result 
    if size == 2 :
        if x == X and y == Y:
            print(result)
            return 
        result += 1
        if x == X and y+1 == Y:
            print(result)
            return 
        result += 1
        if x+1 == X and y == Y:
            print(result)
            return 
        result += 1
        if x+1 == X and y+1 == Y:
            print(result)
            return
        result += 1
        return

    solve(size / 2 , x  , y )
    solve(size / 2 , x   , y + size /2)
    solve(size / 2 , x + size /2  , y )
    solve(size / 2 , x + size /2  , y+ size /2 )


result = 0
size , X , Y = map(int , sys.stdin.readline().split())
solve(  2 ** size, 0 , 0 )
