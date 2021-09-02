# x 는 y 보다 큰 값 이 아니라도
# 두번째 시기에 x , y 가 반전 되기 때문에 상관없음

def gcd( x: int , y : int) -> int:
    if y == 0:
        return x
    else: 
        return gcd( y , x % y)

if __name__ =="__main__":
    print("두 정수의 최대 공약수를 구합니다")
    x = int(input("첫번째 최대 공약수를 입력하세요"))
    y = int(input("두번째 최대 공약수를 입력하세요"))

    print(gcd( x , y))