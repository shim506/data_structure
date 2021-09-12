# 친구 네트워크

def find(name):
    if name == dic[name]:
        return name
    else: 
        p = find(dic[name])
        dic[name] = p
        return dic[name] 

def union(name1, name2):

    parent1 = find(name1)
    parent2 = find(name2)

    if parent1 != parent2 :
        dic[parent2] = parent1
        number[parent1] += number[parent2]
    # parent2 의 부모값을 parent1 으로 바꿔줌으로써
    # 두 tree를 합쳤다고 볼 수 있다.
case = int(input())

for i in range(case):
    group = int(input())
    
    dic = dict()
    number = dict()


    for j in range(group):
        name1 , name2 =  input().split()
        
        if name1 not in dic:
            dic[name1] = name1
            number[name1] = 1
        if name2 not in dic:
            dic[name2] = name2
            number[name2] = 1

        union(name1 , name2 )
        
        parent = find(name1 )
        print(number[parent])
                
            





        
        
            

