# 공유기 설치

N ,C = map(int , input().split())
lst = []
for i in range(N):
    lst.append(int(input()))

lst.sort()

max_val = lst[-1] - lst[0]
min_val = 1
result = 0

while (max_val >= min_val):
    mid = (max_val + min_val) //2 

    installed = lst[0]
    count = 1

    for i in range(1,len(lst)):
        if lst[i] - installed >= mid:
            count +=1
            installed = lst[i]
            #print(f'installed : {installed}')
    
    if count >= C:
        result = mid
        min_val = mid+1
        #print(f'result : {result}')
     
    else:
        max_val=mid-1

print(result)
    

