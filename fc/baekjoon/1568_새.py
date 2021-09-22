#새

# 등차 수열의 시간 복잡도는 n**2

count = 0
num = 0
birds = int(input())

while birds >0:
    count += 1
    num += 1
    if birds -  num <0:
        num =1
    birds -= num

print(count)
    