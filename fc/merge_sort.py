def splite(data):
    if len(data) < 2:
        return data
    else:
        length = len(data)//2
        left = data[: length]
        right = data[length:]
        #right가 한개 더 클 수 있음
       
        return merge(splite(left) , splite(right))

def merge(data1 , data2):
    point1 , point2 = 0 , 0
    newlist = []
    while point1 <= len(data1)-1 and point2 <= len(data2)-1:
        if data1[point1] < data2[point2]:
            newlist.append(data1[point1])
            point1 += 1
        else:
            newlist.append(data2[point2])
            point2 += 1
    if point1 > len(data1)-1:
        while point2 <= len(data2)-1:
            newlist.append(data2[point2])
            point2 +=1
    else:
        while point1 <= len(data1)-1:
            newlist.append(data1[point1])
            point1 +=1
        
    #print(newlist)
    return newlist


import random
list = random.sample(range(50) , 40)
#list = [1,0,5,10,15,6,99,87] 
print(splite(list))