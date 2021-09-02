from typing import Sequence , Any

def seq_search(lst:Sequence , value:Any) -> int:
    for i in range(len(lst)):
        if value == lst[i]:
            return i
    return -1

lst = [1,2,10 ,5]
x = seq_search(lst , 11)
print(x)