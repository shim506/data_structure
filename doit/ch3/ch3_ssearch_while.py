from typing import Sequence , Any


def seq_search(lst: Sequence , val : Any)-> int:
    i = 0
    while True:
        if len(lst) == i:
            return -1
        elif lst[i] == val:
            return lst[i]
        i+=1


lst = [1,2,10 ,5]
x = seq_search(lst , 11)
print(x)