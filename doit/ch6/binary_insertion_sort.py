from typing import MutableSequence

def binary_insertion_sort(a: MutableSequence) -> None : 
    n = len(a)

    for i in range( 1 , n):
        key = a[i]
        pl = 0
        pr = i-1 # i가 아닌 i-1 인 이유는 교환은 주목한 위치의 값보다
        #작다는 전재에서 시작되기 때문에 현재 위치 전을 기준으로 잡는다

        while True:
            pc = (pr+ pl ) //2
            if a[pc] == key:
                break
            elif a[pc] < key:
                pl = pc+1
            else :
                pr = pc-1
            if pl > pr:
                break
        # 일치를 통해 탈출하면 같은 값의 뒤에 배치
        # 아닐 경우 pr+1 값 혹은 pl-1 값 혹은 pr +1 값이 해당위치
        pd = pc +1 if pl <= pr else pr+1

        for j in range(i , pd , -1) :
            a[j] = a[j-1]
        a[pd] = key
    return a

        
y = [5,9,1,3,2]
x = binary_insertion_sort(y)

for i in range(len(x)):
    print(x[i])
        


    
    