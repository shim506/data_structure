# 01 타일

N = int(input())

lst =[0] * 1000001

lst[1] = 1
lst[2] = 2

for i in range(3 , N+1):
    lst[i] = (lst[i-1] + lst[i-2]) %15746

print(lst[N] )
'''

def tile(x : int):
    if lst[x] == None:
        lst[x] = tile(x-1) + tile(x-2)
        return lst[x]
    else:
        return lst[x]

print(tile(N)%15746)

'''