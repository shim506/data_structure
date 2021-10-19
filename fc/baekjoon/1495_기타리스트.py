# 기타리스트
N  , S  , M = map(int , input().split())

lst = list(map(int , input().split()))

dp = [[0]*(M+1) for i in range(N+1)]
dp[0][S] = 1

for i in range(1,N+1):
    for j in range(M+1):
        if dp[i-1][j] == 1:
            if j - lst[i-1] >= 0:
                dp[i][j - lst[i-1]]= 1
            if j+ lst[i-1] <= M:
                dp[i][j + lst[i-1]]= 1


result = -1
for i in range(M , -1 , -1):
    if dp[N][i] ==1:
        result = i
        break

print(result)







'''
def recur(sum_val , idx):
    if idx == N:
        result.append(sum_val)
        return
    else:
        plus_val = sum_val + lst[idx]
        minus_val = sum_val - lst[idx]

        if plus_val <= M:
            recur(plus_val ,idx+1 )
        if minus_val >= 0 :
            recur(minus_val , idx+1)
        else:
            result.append(-1)
        return

lst = list(map(int , input().split()))
result=[]
idx = 0

recur(S , idx)
print(max(result))
'''











        
    