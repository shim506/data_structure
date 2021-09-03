import random

def select_sort(delta):
    new_delta = delta
    for i in range(len(delta) -1):
        min_val =  min(new_delta[i:])
        min_idx = new_delta.index(min_val)
        new_delta[i] , new_delta[min_idx] =new_delta[min_idx] , new_delta[i] 
    return new_delta


ran_list = random.sample(range(100) , 50 )

print(select_sort(ran_list))