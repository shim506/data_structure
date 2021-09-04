def quick_sort(list):
    if len(list) < 2:
        return list
    
    big_list=[]
    small_list=[]

    pivot = list[0]

    # list comprehension practice
    big_list = [item for item in list[1:] if item > pivot]
    small_list = [item for item in list[1:] if item <= pivot]
    
    '''
    for i in list[1:]:
        if i > pivot:
            big_list.append(i)
        else:
            small_list.append(i)
    '''
    return quick_sort(small_list) + [pivot] + quick_sort(big_list)

import random
list  = random.sample(range(80) , 60)
print(quick_sort(list))