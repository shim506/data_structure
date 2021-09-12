# 프린터 큐

test_case = int(input())

for _ in range(test_case):
    n , target_idx = list(map(int , input().split(' ')))
    queue = list(map(int , input().split(' ')))
    queue = [(i , idx ) for idx , i  in enumerate(queue)]

    max_tuple  = max(queue)
    pop_idx = max_tuple[1]

    count = 1
    while True:
        
        max_val = max(queue)[0]
        
        if queue[0][0] == max_val:
            
            ele = queue.pop(0)
            pop_idx = ele[1]
            if pop_idx == target_idx:
                print(count)
                break
            count += 1
           
        else:
            temp = queue[0]
            del queue[0]
            queue.append(temp)
        
        
    
    


    #for i in range queue:
