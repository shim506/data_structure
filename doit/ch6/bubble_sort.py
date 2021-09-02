from typing import MutableSequence

def bubble_sort(a: MutableSequence) -> None:
    n = len(a)
    # n-1 번의 교환이 이루어짐
    for j in range(n-1):
        for i in range(n-1 , j , -1):
            if a[i] > a[i-1]:
                temp = a[i-1]
                a[i-1] = a[i]
                a[i] = temp
        

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
