# 평범한 배낭

N , K = map(int, input().split())

# 2차원 배열 생성
dp =[[0]*(K+1) for _ in range(N+1)]
lst = []


# j 는 열으로서 각무게를 의미하고
# i 는 행으로서 각각의 물품을 의미한다

for i in range(1,N+1):
    weight , value = map(int, input().split())
    #print(weight)
    for j in range(1,K+1):
        if j < weight : 
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(dp[i-1][j] , dp[i-1][j-weight] + value)


print(dp[N][K])


