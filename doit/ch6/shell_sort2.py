from typing import MutableSequence


def sell_sort2(a: MutableSequence) -> None:
    n = len(a)
    h = 1
    while h < n//9:
        h = h*3 +1 

    # i 는 현재 주목하고 있는 위치
    # j(비교값) 의 최초값은 i에서 h만큼 앞의 값
    while h> 0:
        for i in range(h , n):
            j = i - h
            temp  = a[i]
            while j>=0 and a[j] > temp:
                a[j+h] = a[j]
                j -= h
            a[j + h] = temp
        h//=3
    return a
     


y = [5,9,1,3,2, 11 ,16,8]
x = sell_sort2(y)

for i in range(len(x)):
    print(x[i])
        


       

