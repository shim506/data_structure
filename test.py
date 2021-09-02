'''
tub = (1,)
lst = [1,2,3]

print(id(lst))

lst[1 ] = 3
print(id(lst))
print(id(tub))
tub = (1,3)
print(id(tub))
tub[1]  = 10
'''
lst = [1,2,3] 
#print(id(lst))
lst.append(2)
#print(id(lst))

x  = ("one" , "two" ,"three" ,"four")

print(x[1])
#for i in range(len(x)):
#    print(x(i))

'''
for i , name in enumerate(x):
    print(f"x[{i}] = {name}")
'''


