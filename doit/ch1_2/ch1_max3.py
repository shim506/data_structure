print("세정수의 최대값을 구합니다")




def msg(a):
    return "정수의" + a +"값을 입력하세요"

a = int(input(msg('a')))
b = int(input(msg('b')))
c = int(input(msg('c')))

maximum = a

if b > maximum :
    maximum = b
if c > maximum :
    maximum = c    

print(maximum)

