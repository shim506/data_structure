# 스택과 수열

test  = int(input())

lst = list(map(int , input().split()))
stack = []
result = []
count = 0


for ele in lst:
    while ele > count:
        stack.append(count)
        count +=1 
        result.append("+")
    if ele != count :
        print("NO")
        exit(0)
    else:
        stack.pop()
        result.append("-")

for i in result:
    print(i)
