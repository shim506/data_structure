# 친구 네트워크

test = int(input())

def find(name):
    if dic[name] == name:
        return name
    
    parent = find(dic[name])
    dic[name] = parent
    return parent

def union(name1 , name2):
    n1 = find(name1)
    n2 = find(name2)

    if n1 != n2:
        count[n1] += count[n2]
        dic[n2] = n1


for i in range(test):
    
    num = int(input())
    
    dic = dict()
    count = dict()
    
    for j in range(num):
        name1 , name2= input().split()

        if name1 not in dic:
            dic[name1] = name1
            count[name1] = 1
        if name2 not in dic:
            dic[name2] = name2
            count[name2] = 1
        
        union(name1 , name2)
        parent = find(name1)
        print(count[parent])




