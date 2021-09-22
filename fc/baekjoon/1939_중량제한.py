# 중량제한

from collections import deque

def BFS(mid : int):
    visited = set()
    needvisit= deque()

    visited.add(startNode)
    needvisit.append(startNode)
    

    while needvisit:
        ele = needvisit.popleft()
        #print(ele)
        #print(dic[ele])
        for x , w in dic[ele]:
            if x not in visited and w >= mid:
                visited.add(x)
                needvisit.append(x)

    return True if endNode in visited else False
        

N , M = map(int , input().split())

node_set = set()
dic = [[] for _ in range(N+1)]

start = 1000000000
end = 1

for i in range(M):
    x , y ,weight = map(int , input().split())
    node_set.add(x)
    dic[x].append((y , weight))
    dic[y].append((x , weight))
    
    start = min(start , weight)
    end = max(end , weight)

startNode  , endNode = map(int , input().split())
result = start

# 같아지는 순간이 마지막 업데이트 가능한순간이므로
# 등호가 들어감
while(start <= end):
    mid = (start + end) // 2
    if BFS(mid) :
        result = mid
        start = mid+1
    else:
        end = mid-1
    
print(result)



