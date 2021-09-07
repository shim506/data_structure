# 1. 간선의 가중치가 낮은 순서로 sorting  한다
# 2. 간선을 낮은 순서대로 연결하되 신장트리의
# 조건을 어기지 않는지를 확인한다.

# 싸이클의 판단유무는 union-find 알고리즘을 이용함
# 각각의 부분집합의 root-node를 확인해서 다를경우 싸이클 x -  합침
# union(합칠) 경우 높이가 높은 root-node를 기준으로 합침
# 높이가 같을경우 하나의 트리의 높이를 임의로 올려 합침

#edge 의 원소중 숫자가 가장 앞에 오는 것은 정렬에 이용하기 위해


graph = {
'vertices' : ['A' , 'B' , 'C' ,'D' ,'E' , 'F' ,'G'], 
'edges' :[
        (7, 'A', 'B'),
        (5, 'A', 'D'),
        (7, 'B', 'A'),
        (8, 'B', 'C'),
        (9, 'B', 'D'),
        (7, 'B', 'E'),
        (8, 'C', 'B'),
        (5, 'C', 'E'),
        (5, 'D', 'A'),
        (9, 'D', 'B'),
        (7, 'D', 'E'),
        (6, 'D', 'F'),
        (7, 'E', 'B'),
        (5, 'E', 'C'),
        (7, 'E', 'D'),
        (8, 'E', 'F'),
        (9, 'E', 'G'),
        (6, 'F', 'D'),
        (8, 'F', 'E'),
        (11, 'F', 'G'),
        (9, 'G', 'E'),
        (11, 'G', 'F')
    ]
}

rank =dict()
parent = dict()

def intitial(graph):
    for vertex in graph["vertices"]:
        rank[vertex] = 0
        parent[vertex] = vertex


# 싸이클의 판단유무는 union-find 알고리즘을 이용함
# 각각의 부분집합의 root-node를 확인해서 다를경우 
def find(node):
    if parent[node] != node:
        parent[node] = find(parent[node])
    return parent[node]

# union(합칠) 경우 높이가 높은 root-node를 기준으로 합침
# 높이가 같을경우 하나의 트리의 높이를 임의로 올려 합침
# 가장 우선은 각각의 root_node를 찾는것이다
def union(node_start:str , node_end : str):
    root1 = find(node_start)
    root2 = find(node_end)
    
    if rank[root1] > rank[root2]:
        parent[root2] = root1
    elif rank[root2] == rank[root1]:
        parent[root1] = root2
        rank[root2] +=1
    else:
         parent[node_start] = node_end


def kruskal(graph):
    
    result_list = list()
    edges  = graph["edges"]

    # 1. 초기화
    intitial(graph)

    # 2. 정렬
    edges.sort()

    # 3. union-find
    for edge in edges:
        weight , start_node , end_node = edge
        if find(start_node) != find(end_node):
            union(start_node , end_node)
            result_list.append(edge)
    
    return result_list






print(kruskal(graph))
