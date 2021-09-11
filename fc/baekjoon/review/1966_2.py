# 프린터 큐

test = int(input())

for i in range(test):
    N , target_idx = map(int , input().split())
    queue = list( map(int , input().split()))
    queue = [(i , idx) for idx , i in enumerate(queue) ]
    
    count = 1

    while True : 

        max_val , max_idx = max(queue)
        if queue[0][0] == max_val:
            if queue[0][1] == target_idx:
                print(count)
                break
            queue.pop(0)
            count += 1

        else:
            temp = queue[0]
            queue.append(temp)
            del queue[0]



    

    
