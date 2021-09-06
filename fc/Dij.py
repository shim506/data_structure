import heapq
# heapq 는 최소큐와 같이 가장 앞에는 가장 작은 key 값으로 배치된다
#queue = [] 
#heapq.heappush(queue , [2 , 'A'])
#print(queue[0])

def dijkstra(graph, start_node):
    
    dist_list = {node : float('inf') for node in graph }
    '''
    # 위의 한줄 포문 과 같은 의미임
    for i in graph:
        dist { i : float('inf')}
    '''
    dist_list[start_node] = 0
    queue = []
    heapq.heappush(queue , [dist_list[start_node]  , start_node])
    # 숫자 그리고  node

    while queue:
        start_node = queue.pop()
        
        if dist_list[start_node[1]] < start_node[0]:
            continue

        for node , distance in graph[start_node[1]].items():
            print(node)
            if(  dist_list[node]> start_node[0] +distance):
                dist_list[node] = start_node[0] +distance
                print( [dist_list[node] , node])
                heapq.heappush( queue , [dist_list[node] , node] )
            
    return dist_list
        
    

  

mygraph = {
    'A': {'B': 8, 'C': 1, 'D': 2},
    'B': {},
    'C': {'B': 5, 'D': 2},
    'D': {'E': 3, 'F': 5},
    'E': {'F': 1},
    'F': {'A': 5}
}

a = dijkstra(mygraph, 'A')
print(a)