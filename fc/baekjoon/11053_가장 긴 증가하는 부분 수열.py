# 가장 긴 증가하는 부분 수열

size = int(input())
lst = list(map(int , input().split()))

now_result = 0
max_num = 0

lst2 = set()

for i in range(size):
    #print(now_result)
    #if(lst[i] >= max_num):
        #now_result +=1
        #max_num = lst[i]
    lst2.add(lst[i])
print(len(lst2))