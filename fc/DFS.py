def DFS(graph , start_node):
    
    visited = list()
    need_vist = list()

    need_vist.append(start_node)
    
    # queue는 넣는 곳 빠지는곳이 기록되어 있기때문에 따로 시간 복잡도 o(1)로 볼 수 있다.
    while(len(need_vist) != 0):
        ele = need_vist[-1]
        del need_vist[-1]

        if ele not in visited :
            visited.append(ele)
            
            # 같은 표현
            need_vist.extend(graph[ele])
            '''
            for i in graph[ele]:
                need_vist.append(i)
            '''
    return visited


graph = dict()

graph['A'] = ['B', 'C']
graph['B'] = ['A', 'D']
graph['C'] = ['A', 'G', 'H', 'I']
graph['D'] = ['B', 'E', 'F']
graph['E'] = ['D']
graph['F'] = ['D']
graph['G'] = ['C']
graph['H'] = ['C']
graph['I'] = ['C', 'J']
graph['J'] = ['I']

print(DFS(graph , 'A'))






