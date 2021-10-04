# 가장 긴 증가하는 부분 수열

# 동적 계획법 풀이
# D[i] : A[i]를 마지막 값으로 가지는 가장 긴 증가 부분 수열의 길이

# A[i]가 어떤 증가부분 수열의 마지막 값이 되기 위해서는 A[i]가 추가
# 되기전 증가부분 수열의 마지막 값이 A[i] 보다 작은 값이어야한다.

# 따라서 A[i] 를 마지막 값으로 가지는 '가장 긴' 증가 부분 수열의 길이는 A[i]가
# 추가될 수 있는 증가 부분수열중 가장 긴 수열의 길이에 1을 더한 값이된다.


size = int(input())
lst = list(map(int , input().split()))

dp = [1] * (size+1)

for i in range(size):
    for j in range(0 , i+1):
        if lst[i] > lst[j]:
            dp[i] = max(dp[i] , dp[j]+1)

print(max(dp))

