# 좌표 정렬하기

test = int(input())

lst = list()

for i in range(test):
    x , y = map(int , input().split())
    lst.append((x,y))

newlst = sorted(lst , key= lambda x: (x[0] ,x[1]) )

for i in newlst:
    u , v  = i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    print(u, end=" ")
    print(v)