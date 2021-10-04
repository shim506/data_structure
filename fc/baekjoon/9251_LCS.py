# LCS

word1 = input()
word2 = input()

size1 = len(word1)
size2 = len(word2)

dp = [[0]*(size2+1) for i in range(size1+1)]

for i in range(1 , size1+1):
    #change = False
    for j in range(1,size2+1):
        if word1[i-1] == word2[j-1]:
            dp[i][j] = dp[i-1][j]+1
        else:
            dp[i][j] = max(dp[i-1][j] , dp[i][j-1])

print(max(max(dp)))

            