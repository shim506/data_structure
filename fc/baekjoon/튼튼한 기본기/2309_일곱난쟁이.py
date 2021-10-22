lst = []

for _ in range(9) :
    lst.append(int(input()))
total = sum(lst)

for i in range(9):
    for j in range(i+1 , 9):
       
        x , y = lst[i] , lst[j]
        if total - x-y == 100:
            lst.remove(x)
            lst.remove(y)
            lst.sort()           
            for _ in lst:
                print(_)
            exit(0)
