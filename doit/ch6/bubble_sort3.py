# 핵심은 마지막 교환이 이루어진 시점을 저장해두었다가
# 다음 패스에서 그 앞까지만 교환을 시행한다.

# k 는 현재 정렬이 완료되었다고 판단 되는 곳
# last 또한 정렬이 완료되었다고 판단 되는 곳 -> 마지막으로 교환이 이루어진 곳

from typing import MutableSequence


def bubble_sort(a:MutableSequence) -> None:
    n = len(a)
    k = 0

    while k < n-1:
        last = n-1
        for i in range(n-1 , k , -1):
            if a[i] < a[i-1]:
                temp = a[i-1]
                a[i-1] = a[i]
                a[i] = temp
                last = i
        k = last

if __name__ == "__main__":
    print('버블 정렬을 수행합니다')

    num = int(input("원소의 수를 입력하세요"))

    x = [None]*num 
    for i in range(num):
        x[i] = int(input(f'x[{i}] : '))
    bubble_sort(x)

    print("오름 차순으로 정렬했습니다")
    for i in range(num):
        print(f'x[{i}] = {x[i]}')

