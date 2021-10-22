# 이진수

T = int(input())

for _ in range(T):
    num = int(input())
    x = bin(num)[2:]
    print(x)
    for i in range(len(x)):
        print(i)
        if x[i-1] == "1":
            print(x[i-1])