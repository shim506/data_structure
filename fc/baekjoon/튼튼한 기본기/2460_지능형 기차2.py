max_val = 0
total_val = 0

for _ in range(10):
    out , put = map(int ,input().split())
    temp = total_val
    temp -= out
    temp += put
    max_val = max(temp , max_val)
    total_val = temp
    #print(max_val)

print(max_val)
