n = int(input())
lst = []
for i in range(n):
    x = int(input())
    lst.append(x)

stack = []
result = []
count = 1
fale = False

for num in lst:
    while count <= num:
        stack.append(count)
        result.append("+")
        count += 1

    if stack[-1] == num:
        stack.pop()
        result.append("-")
    else: 
        print("NO")
        fale = True

if not fale :
    for i in result:
        print(i)