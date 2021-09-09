# 제일 큰수를 한번찍은 상태라면 반드시 그 후부터는 내림차순을 따라야한다

n = int(input())
sequence_list = []
orign_stack = [i+1 for i in range(n)]
stack_list  = []
result = []
for i in range(n):
    sequence_list.append(int(input()))

#print(orign_stack)


ele = orign_stack.pop(0)
stack_list.append(ele)
result.append('+')

for num in sequence_list:
    

    if len(stack_list) == 0 or stack_list[-1] < num :
        if len(orign_stack) == 0:
            result.append('NO')
            print("NO")
            break
        ele = orign_stack.pop(0)
        stack_list.append(ele)
        result.append('+')
        while stack_list[-1] != num : 
            ele = orign_stack.pop(0)
            stack_list.append(ele)
            result.append('+')
        stack_list.pop()
        result.append('-')
    else:
        if stack_list[-1] > num:
            print("NO")
            result.clear()
            break
        while stack_list[-1] != num : 
            stack_list.pop()
            result.append('-')
        stack_list.pop()
        result.append('-')

if result != None:
    for i in result:
        print(i)
