import heapq
from collections import defaultdict


myedges = [
    (7, 'A', 'B'), (5, 'A', 'D'),
    (8, 'B', 'C'), (9, 'B', 'D'), (7, 'B', 'E'),
    (5, 'C', 'E'),
    (7, 'D', 'E'), (6, 'D', 'F'),
    (8, 'E', 'F'), (9, 'E', 'G'),
    (11, 'F', 'G')
]




def prim(start_node:str , edges):
    #mst(minimum_spanning_tree)
    mst = list()

    # 각 노드별 연결되어 있는 간선들을 저장할 리스트에 저장하고
    # 그 리스트를 defaultdict 딕셔너리에 저장
    # 각 노드 별로 연결된 간선 정보가 저장됨
    adjacent_edge = defaultdict(list)

    for vertex in edges:
        weight , start_node , end_node =  vertex
        adjacent_edge[start_node].append((weight , start_node , end_node))
        adjacent_edge[end_node].append((weight , end_node , start_node))



    connected_node = set(start_node)
    vertex_list  = adjacent_edge[start_node]
    heapq.heapify(vertex_list)

    while vertex_list :
        vertex = heapq.heappop(vertex_list)
        weight , start_node , end_node =  vertex
        # end_node 가 connected_node 에 없을경우 추가
        if end_node not in connected_node:
            connected_node.add(end_node)
            mst.append(vertex)
            for vertex in adjacent_edge[end_node]:
                # 추가적인 최적화 -> heappush 에 비용이 들기때문에 추가
                # end_node 가 다시 start_node가 되고 또다른 end_node가 생길때
                # 해당 end_node가 이미 connected_node 에 존재한다면 추가 하지 않는 조건 추가

                if vertex[2] not in connected_node:
                    heapq.heappush(vertex_list , vertex)
             

        
    return mst
        
        

    

print(prim('A' , myedges))