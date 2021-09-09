
#키로거

# 다음 풀이는 시간 초과가 떴다
# 시간초과의 기준은 100만 정도 이고
# 큐 스텍 을 이용하면 인서트 팝 과정은 n(1) 이므로 매우 효율적이다
# 최초 구현대로 현재 커서 위치를 저장하고 그에 따라 나누고 붙이고를 반복하면
# 시간복잡도가 *o(1) 에서 *2o(n) 으로 늘어나게된다 (이때 주의할점은 *(곱하기) 가 붙어서 시간이 매우 늘어진것으로 판단됨)
case = int(input())
for i in range(case):
    lst_i = input()
    idx = 0
    result = []
    left ,right=[] ,[]
    for ele in lst_i:
        if ele == "<":
            if left:
                right.append(left.pop())
               
        elif ele == ">":
            if right:
                left.append(right.pop())
               
        elif ele == "-":
            if left:
                left.pop()   
        else:
            left.append(ele)
    
    left.extend(reversed(right))
    print(''.join(left))

                