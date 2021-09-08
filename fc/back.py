

# currnet_candidate 현재까지 의 후보 리스트로 
# 최대 N개를 가질 수 있다. (행개수 만큼 , 행마다 하나씩 있으므로)
# ex) [1,3] or [2,4,1] 
def DFS(N, current_row, current_candidate, final_result):
    if current_row == N:
        final_result.append(current_candidate[:])
        return
    
    for candidate_col in range(N):
        if is_available(current_candidate, candidate_col):
            current_candidate.append(candidate_col)
            DFS(N, current_row + 1, current_candidate, final_result)
            current_candidate.pop()


def is_available(currnet_candidate, current_col):
    current_row = len(currnet_candidate) #이제 들어갈 자리(비어있음)
    for queen_row in range(current_row):
        if currnet_candidate[queen_row] == current_col or abs(currnet_candidate[queen_row] - current_col) == current_row - queen_row:
            return False
    return True

def solve_n_queens(N):
    final_result = []
    DFS(N , 0 , [] ,final_result )
    return final_result



print(solve_n_queens(4))