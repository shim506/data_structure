import random
def bubble_sort(delta):
    for i in range(len(delta)-1):
        swap = False
        for j in range(len(delta)-1-i):
            if delta[j] > delta[j+1]:
                delta[j] , delta[j+1] = delta[j+1] , delta[j]
                swap = True
        if swap == False:
            break
    return delta


delta_list = random.sample(range(100),50)
print(bubble_sort(delta_list))