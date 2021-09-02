from typing import MutableSequence

def sell_sort(a: MutableSequence)-> None:
    # 4개 간격의 원소들끼리 교환
    # 2개 간격의 원소들끼리 교환
    # 단순 삽입정렬로 마무리

    n = len(a)
    h  = n//2

    # 주목하는 수는 a[i] 이고
    # j 가 비교하는 인덱스이다
    # j 에서 temp 보다 작다면 j + h 값에 temp를 할당함이 옳다

    while h > 0 :
        for i in range(h ,  n):
            j = i - h
            temp = a[i]
            while j >= 0 and a[j] > temp :
                a[j + h ] = a[j]
                j -= h
            a[j + h] = temp
        h //= 2

    return a


y = [5,9,1,3,2, 11 ,16,8]
x = sell_sort(y)

for i in range(len(x)):
    print(x[i])
        