# 최대 공약수 최대공배수

x , y = map(int  , input().split())


def GCD(x , y):
    while(y > 0):
        x , y = y, x%y
    return x

def LCM(x , y ):
    return (x * y // GCD(x , y))

print(GCD(x , y))
print(LCM(x,y))

    