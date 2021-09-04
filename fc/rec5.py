def func(n):
    print(n)
    if n == 1 :
        return n
    elif n %2 != 0:
        return func(n*3 +1)
    else: return func(n//2)
    
def func2(n):
    if n == 1 :
        return 1
    elif n ==2 :
        return 2
    elif n == 3: 
        return 4
    else:
        return func2(n-1) + func2(n-2) + func2(n-3)


print(func2(5))