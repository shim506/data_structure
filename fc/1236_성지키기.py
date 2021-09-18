# 성지키기

# 전략 행과 열중에 비어 있는 값을 찾고
# 더 많이 비어 있는 값이 필요한 경비수이다.


# N 이 행
# M 이 열

N , M = map(int , input().split())

row_empty = [i for i in range(1,N+1)]
col_empty = [i for i in range(1,M+1)]


#print(row_empty)
#print(col_empty)

row= []

for i in range(N):
    row = input()
    for j in range(len(row)):
        pos = row[j]
        
        # i, j 는 0 부터 시작하므로
        if pos == "X" and i+1 in row_empty:
            row_empty.remove(i+1)
        if pos == "X" and j+1 in col_empty:
            col_empty.remove(j+1)

print(max(len(row_empty) , len(col_empty)))



