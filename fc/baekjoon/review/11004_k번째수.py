# k 번째 수

# 계수정렬로 풀어보자


N , k = map(int, input().split(" "))
lst =list( map(int , input().split()))

lst.sort()

print(lst[k-1])

'''
count_lst = [0] * (N+1)

for i in lst:
    count_lst[i] +=1

count = 0
print(count_lst)
for idx in range(len(count_lst)):
    count += count_lst[idx]
    if count >= k:
        print(idx)
        break
'''


