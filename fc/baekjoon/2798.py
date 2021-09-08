n , M = map(int , input().split())
cards = list(map(int , input().split()))

hubo = []
for i in range(len(cards)):
    for j in range(len(cards)):
        if i == j:
            continue
        for k in range(len(cards)):
            if i == k or j == k:
                continue      
            elif  cards[i]+cards[j]+cards[k]  <= M :
                hubo.append(cards[i]+cards[j]+cards[k])


print(max(hubo))

               