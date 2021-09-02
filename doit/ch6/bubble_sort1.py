from typing import MutableSequence

# 전체 반복회수는 원소개수(n)-1 이다
# j번째에 패스는 n-1-j 번 실행하게된다
# j 번째 정렬 시기에 j-1 번째 원소 까지는 정렬 보장되므로 i 값에 j+1 까지만 넘겨준다
# -> range(n-1 , j , -1) 를 통해 j+1 까지만 리턴할 수 있게함
# -> range(n-1-j , 0 , -1) 또한 개수는 같지만 시작과 끝나는 시점이 차이나서 사용할 수 없음
def bubble_sort(a:MutableSequence) -> None:
    n = len(a)
    for j in range(n-1):
        for i in range(n-1 , j , -1):
            if a[i] < a[i-1]:
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