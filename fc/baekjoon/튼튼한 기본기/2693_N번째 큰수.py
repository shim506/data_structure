#N 번재 큰수 

N = int(input())

for _ in range(N):
    lst = list(map(int , input().split()))
    lst.sort()
    print(lst[-3])