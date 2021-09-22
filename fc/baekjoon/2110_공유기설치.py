# 공유기 설치
# 동적 계획법으로 풀어봅시당~

N ,C = map(int , input().split())
lst = []
for i in range(N):
    lst.append(int(input()))

lst.sort()

gap_max = lst[-1] - lst[0]
gap_min = 1
result = 0

while gap_max >= gap_min :
    mid = (gap_max + gap_min) // 2
    intalled_value = lst[0]
    count = 1

    for i in range(1,len(lst)):   
        if lst[i] >= intalled_value + mid:
            intalled_value = lst[i]
            count += 1 
    if count >= C:
        result = mid
        gap_min = mid +1
        
    else:
        gap_max = mid -1
   
print(result)
