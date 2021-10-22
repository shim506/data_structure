# 연산자 끼워넣기
import copy
N = int(input())
lst = list(map(int , input().split()))
operList =  list(map(int , input().split()))

maximum = -1e9
minimum = 1e9
def recur( cnt , total , plus , minus , mul , div ):
    global maximum  , minimum
    if cnt == N:
        maximum = max(maximum , total)
        minimum = min (minimum ,total)
        return 

    if plus :
        recur(cnt+1 , total + lst[cnt] , plus-1 , minus , mul , div)
    if minus:
        recur(cnt + 1, total - lst[cnt], plus, minus - 1, mul, div)
    if mul:
        recur(cnt + 1, total * lst[cnt], plus, minus, mul - 1, div)
    if div:
        recur(cnt + 1, int(total / lst[cnt]), plus, minus, mul, div - 1)

recur(1, lst[0] , operList[0] , operList[1] , operList[2] , operList[3])
print(maximum)
print(minimum)
