from typing import MutableSequence



def selection_sort(a : MutableSequence) -> None:
    n = len(a)

    b = [None]*n
    
    for i in range(n):
        #print(i)
        y = min(a)       
        b[i] = y
        a.remove(y)
    
    for i in range(len(b)):
        print(b[i])
        

'''
if __name__ == "__main__":
    print('버블 정렬을 수행합니다')

    num = int(input("원소의 수를 입력하세요"))

    x = [None]*num 
    for i in range(num):
        x[i] = int(input(f'x[{i}] : '))
    selection_sort(x)

    print("오름 차순으로 정렬했습니다")
    for i in range(num):
        print(f'x[{i}] = {x[i]}')

'''
x = [1,2,3,9,0]
selection_sort(x)