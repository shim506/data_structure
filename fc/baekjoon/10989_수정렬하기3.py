# 수 정렬하기3

# 계수 정렬 알고리즘 사용

import sys
test = int(input())

lst = [0] * 10001

for i in range(test):
    val = int(sys.stdin.readline())
    lst[val] +=1



for i in range(10001):
    if lst[i] != 0 :
        for j in range(lst[i]):
            print (i)
