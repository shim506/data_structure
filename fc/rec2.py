def multiple(data):
    num = 1
    for i in range( 1 , data+1):
        num *= i
    return num

def mul2(num):
    if num <= 1 :
        return num
    return mul2(num-1) * num

print(mul2(10))
print(multiple(10))