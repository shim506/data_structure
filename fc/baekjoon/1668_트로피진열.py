# 트로피 진열

test = int(input())

lst = []
for i in range(test):
    lst.append(int(input()))

count_left = 1
count_right  = 1
max_left = lst[0]
max_right = lst[-1]

for i in range(1 , len(lst)):
    if lst[i] > max_left:
        count_left += 1
        max_left = lst[i]
        

for i in range(len(lst)-1 , -1 , -1):
    if lst[i] > max_right:
        count_right += 1
        max_right = lst[i]

        

print(count_left)
print(count_right)

     
