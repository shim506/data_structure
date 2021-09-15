# 피보나치 수

lst = [None]* 50

def fibo(n):
    lst[0] = 0
    lst[1] = 1

    if lst[n] == None:
        lst[n] = fibo(n-1) + fibo(n-2)
        return lst[n]
    else:
        return lst[n]
     

val = int(input())
print(fibo(val))