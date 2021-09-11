# 수찾기
from typing import DefaultDict

M = int(input())
dic = DefaultDict(list)

lst1 = list(map(int , input().split()))

for i in lst1:
    dic[i].append( i)

N = int(input())
lst2 = list(map(int , input().split()))


for i in lst2:
    if  i in dic[i] :
        print("1")
    else:
        print("0")



