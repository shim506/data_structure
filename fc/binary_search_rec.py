def binary_search(data , value):
    if len(data) == 1 and value != data[0]:
        return False
    center_idx = len(data)//2
    
    if value == data[center_idx]:
        return center_idx
    elif value > data[center_idx] :
        print(data[center_idx : ])
        return binary_search(data[center_idx : ] ,value)
    else:
        print(data[:center_idx])
        return binary_search(data[:center_idx] , value)

import random
#list = random.sample(range(40) , 40)
list = [1,2,3,8,11,15,16,17,20] 
print(binary_search(list , 20))
    
