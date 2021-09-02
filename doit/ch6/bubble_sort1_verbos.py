from typing import MutableSequence

def bubble_sort(a: MutableSequence) -> None:
    n = len(a)
    count = 0   #비교횟수
    scnt = 0    #교환 횟수
    for i in range(n-1):
        print(f'패스 {i+1}')
        for j in range(n-1 , i , -1):
            for m in range(0,n-1):
                print(f'{a[m]:2}' + ('  ' if m != j-1 else (' +' if a[j-1] > a[j] else " -")), end=" ")

            print(f'{a[n-1]:2}')
            count += 1
            if a[j] < a[j-1]:
                a[j] , a[j-1] = a[j-1] , a[j]
                scnt += 1
    print(f'비교를 {count} 번 진행햇습니다')
    print(f'교환을 {scnt} 번 진행햇습니다')
    \
num = int(input("원소의 수를 입력하세요"))

x = [None]*num 
for i in range(num):
    x[i] = int(input(f'x[{i}] : '))
bubble_sort(x)

print("오름 차순으로 정렬했습니다")
for i in range(num):
    print(f'x[{i}] = {x[i]}')