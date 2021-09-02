from typing import MutableSequence

def selection_sort(a:MutableSequence) -> None:
    n = len(a)
    for i in range(n-1):
        min_val =  min(a[i:])
        cur_val = a[i]
        min_val_idx = a.index(min_val)
        a[i]  , a[min_val_idx] = a[min_val_idx] , a[i]

     
    for i in range(len(a)):
        print(a[i])
        
selection_sort([8,2,0,10])