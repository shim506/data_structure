# 수 정렬하기

test = int(input())

lst = list()
for i in range(test):
    lst.append(int(input()))

lst.sort()

for i in lst:
    print(i)