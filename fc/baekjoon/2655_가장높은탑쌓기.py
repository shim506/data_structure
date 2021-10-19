# 가장 높은 탑쌓기

N = int(input())

# 주의 index + 1 이 여기서 말하는 벽돌 번호이다.
lst = []
dp = [[1]*(N) for i in range(N+1)]

for _ in range(N):
    size , height , weight  = map(int , input())
    lst.append(size , height , weight)

for i in range(1 , N+1):
    for j in range(0,N):
        if dp



