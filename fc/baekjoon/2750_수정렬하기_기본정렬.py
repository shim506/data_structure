# 수 정렬하기
# 기본 정렬

test = int(input())

lst = list()
for i in range(test):
    lst.append(int(input()))

# 버블 정렬
for i in range(len(lst)-1):
    for j in range(len(lst) -i -1 ):
        if lst[j] > lst[j+1]:
            lst[j] , lst[j+1] = lst[j+1] , lst[j]



for i in lst:
    print(i)



