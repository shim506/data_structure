
from typing import Any , Sequence

def max_a(a:Sequence) -> int:
    maximum = a[0]
    for i in range(len(a)):
        if maximum < a[i]:
            maximum = a[i]
    return maximum

if __name__ =="__main__":
    print("배열의 최대값을 구합니다")
    num = int(input("원소 수를 입력하세요 :"))
    x = [None]*num

    for i in range(num):
        x[i] = int(input(f"x[{i}] 의 값을 입력하세요:"))
    
    print(f'최대값은 {max_a(x)} 입니다')



