# 음계

lst = []
acs_list , des_list = [] , [] 

lst = list(map (int ,input().split()))

    
acs_list , des_list = lst[:] , lst[:]
acs_list.sort()
des_list.sort(reverse=True)

if lst == acs_list :
    str = "ascending"
    print( str)
elif lst == des_list :
    print("descending") 
else:
    print("mixed") 

