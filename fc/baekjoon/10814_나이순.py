#나이순 정렬

N = int(input())

lst = list()

for i in range(N):
    age , name = input().split(" ")
    lst.append((int(age) , name))

lst = sorted(lst , key =lambda x : x[0])
for i in lst:
    u ,v = i
    print(u , end=" ")
    print(v)