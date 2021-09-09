# queue 는 섭입선출을 따른다
# fifo
# 우선순위 큐를 사용하고 싶을때는 python에서 제공하는
# heapq 라이브러리를 사용함이 편한다

from typing import Sequence


lst = list()

def enqueue(lst : Sequence , value):
    lst.append(value)
    
    return

def dequeue(lst):
    result = lst[0]
    del(lst[0])
    return result
    #return lst.pop(0)


enqueue(lst , 10)
enqueue(lst , 30)
enqueue(lst , 20)
print(lst)

print(dequeue(lst))
print(dequeue(lst))