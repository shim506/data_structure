def move(no: int , x : int , y :int)->None:
    #  원판 no개를 x 기둥에서 y 기둥으로 옮김
    # 6 = 1+2+3(기둥 번호)
    #print(f"{no}원판을 {x}에서 {y} 로 이동") 
    if no > 1:
        move(no -1 , x , 6-x-y)
    
    print(f"{no}원판을 {x}에서 {y} 로 이동") 

    if no > 1 :
        move(no-1 ,6-x-y , y )
    
    

print("하노이 탑을 구현")
n = int(input("원판의 개수를 입력"))
move(n , 1,3)

