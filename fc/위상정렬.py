import heapq
n , m  = map(int , input().split())

# 노드와 간선의 정보를 저장할 리스트
# 인덱스는 노드 인덱스에 해당하는 배열은 연결된 노드로의 간선
array= [[] for i in range(n+1)]

# 진입 차수에 대한 값 -index 가 곧 값
indgree = [0] * (n+1)

heap = []
result = []

for _ in range(m):
    x, y = map(int , input().split())
    array[x].append(y)
    indgree[y]+=1

# 과정 1에 해당함
for i in range( 1 , n+1):
    if indgree[i] == 0 :
        heapq.heappush(heap , i)

while heap:
    data = heapq.heappop(heap)
    result.append(data)
    for y in array[data]:
        indgree[y]-=1
        if indgree[y] == 0:
            heapq.heappush(heap , y)
    array[data] = []

    