def sumlist(data):
    if len(data) <= 1 :
        return data[0]
    #length = len(data)
    return data[0] + sumlist(data[1:])

import random 
data = random.sample(range(100), 10)
print (sumlist(data))