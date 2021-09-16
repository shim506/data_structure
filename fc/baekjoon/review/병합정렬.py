# 병합정렬

def splite_merge(lst:list):
    if len(lst) < 2:
        return lst
    
    else:
        lenght = len(lst)//2
        left , right = lst[:lenght] ,lst[lenght:]
        
        left = splite_merge(left)
        right = splite_merge(right)

        right_cnt , left_cnt = 0, 0
        lst_2 = []
        while (left_cnt < len(left) and right_cnt < len(right)):
            if right[right_cnt] < left[left_cnt]:
                lst_2.append(right[right_cnt])
                right_cnt += 1
            else:
                lst_2.append(left[left_cnt])
                left_cnt += 1
        if left_cnt != len(left) :
            lst_2.extend(left[left_cnt:])
        else :
            lst_2.extend(right[right_cnt:])
        return lst_2

    



def merge (right , left):
    return



import random
lst = random.sample(range(50) , 40)
print(lst)
print(splite_merge(lst))