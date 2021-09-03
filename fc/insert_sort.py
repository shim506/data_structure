import random

def insert_sort(delta):
    ## idx 는 현재 주목하고 있는 인덱스 이다
    for i in range(1 , len(delta)-1 ) :
        idx = i-1
        now_num = delta[idx+1]  
        attention_num = delta[idx]
        print(now_num)

        while attention_num > now_num and idx > -1 :
            delta[idx+1] = attention_num
            idx -= 1 
            attention_num = delta[idx]
        delta[idx+1] = now_num
    return delta

delta_list = random.sample(range(50) , 20)
print(insert_sort(delta_list))
        