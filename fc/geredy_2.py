# 부분 배낭 문제

def get_max_value(stuff_dic : dict , weight):
    # 총 value 와 detail(무게 , 가치 , 개수 )를 출력
    data_list = sorted(stuff_dic , key=lambda x:x[1] / x[0], reverse=True)
    
    total_val = 0
    weight_limit = weight
    new_list = []

    for i in data_list:
        if (weight_limit -  i[0]  )> 0:
            weight_limit -= i[0]
            total_val += i[1]
            
            ele = list(i)
            ele.append(1)
            
            new_list.append(ele)

        else:
            rate = i[1] / i[0]
            print(weight_limit)
            total_val += rate * weight_limit

            ele = list(i)
            ele.append(weight_limit / i[0])
            new_list.append(ele)
            break

    return total_val , new_list
    
    

  




data_list = [(10, 10), (15, 12), (20, 10), (25, 8), (30, 5)]
a, b = get_max_value(data_list, 30)
print(a)
print(b)

