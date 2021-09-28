# 카드 정렬하기
import heapq
# 작은수끼리 먼저 합치는것이 필요하다

heap = []
size = int(input())
for _ in range(size):
    val = int(input())
    heapq.heappush(heap , val)

result = 0

# heap 의 마지막 한개 남았을때 값은 더해주지 않는다
# 해당 값은 마지막 덧셈으로 파생된 값이므로
while len(heap) > 1:
    ele1 = heapq.heappop(heap)
    ele2 = heapq.heappop(heap)
    sum_val = ele2 + ele1
    result += sum_val
    heapq.heappush(heap , sum_val)

print(result)

