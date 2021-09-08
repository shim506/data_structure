
#nQeen : 판의 크기를 입력하고 queen의 개수를 입력했을때
#        교착상태의 경우의 수를 출력하는 함수


# 수평 배치를 제 1 규칙으로하고
# promissing 을 수직 , 대각선 체크로 놓고 검증해 나간다

from typing import final


class Node:
    def __init__(self , x , y) -> None:
        self.x = x
        self.y = y
        self.parent = None

def is_available(candidate , current_col):
    current_row = len(candidate)

# current_candidate 는 리스트 형태로 열단위로 늘어나게되므로
# 현재 몇 열인지를 유추할 수 있는 지표가 된다
def DFS(N , current_row , current_candidate , final_result):
    
    if current_row == N:
        final_result.append(current_candidate)
        return

    else:
        for candidate_col in range(N):
            if is_available(current_candidate , candidate_col):
                current_candidate.append(candidate_col)
                DFS(N , current_row+1 , current_candidate ,final_result )
                current_candidate.pop()

                #current_row += 1




        return DFS(N , current_row + 1 , current_candidate , final_result )

def nQueen (N ) -> int:
    final_result  = []
    
    
    DFS(N , 0 , [], final_result)
    return final_result

    
    # positions = []
    # canidate =[]
    # for i in range(size[0]):
    #     for j in range(size[1]):
    #         positions.append([i , j])

    # for i in range(size[0]):
    #     for j in range(size[1]):
    #         positions.append([i , j]) 
    

