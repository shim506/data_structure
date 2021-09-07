from typing import Sequence , Any
import copy

def bin_search(a:Sequence , key:Any) -> int:
    pl = 0
    pr = len(a)-1
    while True:
        pc = (pr+pl) // 2
        print("---------------")
        print(f"pl: {pl}")
        print(f"pc: {pc}")
        print(f"pr: {pr}")
        print("---------------")
        if pl > pr :
            return -1
        if a[pc] > key: 
            pr = pc-1
            #print("pr:" + pr)
        elif a[pc] < key:
            pl = pc+1
            #print("pl:" + pr)
        elif a[pc] ==  key:
            return pc
        

lst = [1,2,10 ,11 ,15 , 16,17]
x = bin_search(lst , 13)
print(x)
    