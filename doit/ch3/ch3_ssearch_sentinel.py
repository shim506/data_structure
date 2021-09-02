from typing import Sequence , Any
import copy


def seq_search(lst: Sequence , val : Any)-> int:
    newlst = copy.deepcopy(lst)
    newlst.append(val)
    i = 0
    while True:
        if newlst[i] == val:
            break
        i+=1
    if i == len(newlst)-1 : return -1
    else : return i


lst = [1,2,10 ,5]
x = seq_search(lst , 11)
print(x)