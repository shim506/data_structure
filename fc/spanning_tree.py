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

parent = dict()     #각각의 노드의 부모 노득
rank = dict()       #각각의 노드의 높이를 의미 처음이 0

def make_set(node):
    parent[node] = node
    rank[node] = 0

def find(node):
    # path compression
    # 상위 node를 계속 찾아 가다가 parent_node가 node인상황
    # 즉 root_node 를 찾으면 멈추게됨 
    if parent[node] != node:
        parent[node] = find(parent[node])
    return parent[node]     

def union(node_v , node_u):
    root_v = find(node_v)
    root_u = find(node_u)

    if rank[root_u] > rank[root_v]:
        parent[root_v] = root_u
    elif rank[root_u] < rank[root_v]:
        parent[root_u] = root_v
    else:
        rank[root_v] += 1 
        parent[root_u] = root_v
    return

def kruskal(graph):
    mst = list()

    # 1. 초기화
    for node in graph["vertices"]:
        make_set(node) 
    

    # 2. 간선 weight 기반 sorting 
    edges = graph['edges']
    edges.sort()


    # 3. 간선연결 (싸이클 없는)
    for edge in edges:
        weight, node_v , node_u = edge
        if find(node_v) != find(node_u):
            union(node_v,node_u)
            mst.append(edge)

    return mst  


print(kruskal(graph))
