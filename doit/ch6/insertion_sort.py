from typing import MutableSequence

def insertion_sort(a : MutableSequence) -> None:
    n = len(a)

    # 두번째 원소 부터 시작하는 이유는 알고리즘의 예외를 없애기 위해서이다.
    # 만약 첫번재 원소가 시작원소이고 첫번째 시행부터 앞수보다 크다면 조회할 뒷 숫자가 없다

    # 현재 주목하는 인덱스는 i
    # 비교대상의 인덱스는 j-1 이다
    # j-1 이 temp 보다 더 작다면 j 위치에 대입하는 것이 옳다
    for i in range(1 , n):
        j = i
        temp = a[i]
        while j > 0 and a[j-1] > temp :
            a[j] = a[j-1] 
            j -= 1
        a[j] = temp
    return a
        
y = [5,9,1,3,2]
x = insertion_sort(y)

for i in range(len(x)):
    print(x[i])
        
