def coin(money , coin_list):
    #500 / 100 / 50 / 1 원
    money_list = dict()
    
    coin_list.sort(reverse =True)

    for i in coin_list :
        cnt = money // i
        money_list[i] = cnt
        money = money % i
    
    return money_list


print(coin(4720, [500,100,50,1] ))