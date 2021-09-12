# 프린터 큐
case = int(input())

result_list = []
test = dict()
for i in range(case):
    file_n , target_idx  = map(int , input().split()) 
    
    lst = [file_n , target_idx ]
    lst2 = list(map(int , input().split()) )
    lst.extend(lst2)
    test[i] = lst


for i in range(case):
    lst = test[i]
    target_idx = lst[1]
    
    file = lst[2:]
    #print(file)
    target = file[target_idx]
    
    result = max(file)
    count = 1
    
    while result != target:
        if file[0] == result:
            file.pop(0)
            result = max(file)
            count +=1
        else:
            temp = file[0]
            del file[0]
            file.append(temp)
    print(count)
    result_list.append(result)





