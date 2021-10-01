# 01 타일


'''

def tile(x : int):
    if lst[x] == None:
        lst[x] = tile(x-1) + tile(x-2)
        return lst[x]
    else:
        return lst[x]

print(tile(N)%15746)

'''