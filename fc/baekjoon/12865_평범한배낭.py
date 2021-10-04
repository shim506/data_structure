# 평범한 배낭

N , K = map(int, input().split())

# 2차원 배열 생성

# j 는 열으로서 각무게를 의미하고
# i 는 행으로서 각각의 물품을 의미한다

# 굳이 2차원 배열로 만든이유
# K 부터 weight-1 까지 역순으로 가야 맞는이유

# -> 앞에서 부터 가게 되면 새롭게 대체된 값에 또 해당 값을 더할 수 있음
# 단적인 예로서 (3,20) 을 생각해보자 dp[3] =20 이 되고 dp[6] = 40 이 되서
# 꼬임

dp =[0 for _ in range(K+1)]

for _ in range(N):
    weight , value =  map(int, input().split())
    for j in range(K , weight-1 , -1):
            if weight <= j:
                dp[j] = max(dp[j] , dp[j-weight] + value)

print(dp[K])


'''
for i in range(1,N+1):
    weight , value = map(int, input().split())
    #print(weight)
    for j in range(1,K+1):
        if j < weight : 
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(dp[i-1][j] , dp[i-1][j-weight] + value)


print(dp[N][K])

'''
