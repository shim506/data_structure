def fibo(n):
    lst = [0]*n
    k = 0
    while k < n :
        print(k , end=" ")
        if k == 0:
            lst[k] = 0
           
        elif k == 1:
            lst[k] = 1
          
        else:
            lst[k] = lst[k-2] + lst[k-1]
        print(lst[k])
        k = k+1
        
    for i in range(n):
        print(f'{lst[i]:2}' , end=" ")


def fibo_rec(n):
    if(n <=1) :
        return n
    else:
        return fibo_rec(n-1) + fibo_rec(n-2)

print(fibo_rec(8))
fibo(8)