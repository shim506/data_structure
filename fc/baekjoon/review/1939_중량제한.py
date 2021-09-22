# 중량제한
from collections import deque

def BFS(mid : int):
    
    visited = set()
    need_visit = deque()

    visited.add(start_node)
    need_visit.append(start_node)


    while need_visit : 
        ele = need_visit.popleft()
        for i in dic[ele]:
            y , weight = i
            if weight >= mid and y not in visited:
                visited.add(y)
                need_visit.append(y)
    if end_node in visited:
        return True
    else:
        return False


N , M = map(int , input().split())

node_set = set()
dic = [[] for i in range(N+1)] 

min_val = 1000000000
max_val = 0
result = 0

for i in range(M):
    x, y , weight = map(int , input().split())
    node_set.add(x)
    dic[x].append((y,weight))
    dic[y].append((x , weight))

    min_val = min(min_val , weight)
    max_val = max(max_val , weight)

start_node , end_node =  map(int , input().split())
result = min_val


while min_val <= max_val :
    mid = (max_val + min_val)  //2
    if BFS : 
        result = mid
        min_val = mid+1
       
    else:
        max_val = mid -1

print(result)