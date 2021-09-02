class Queen:

    def __init__(self , size) -> None:
        self.size = size
        self.pos = [0]* self.size

    def put(self) -> None:
        for i in range(self.size):
            print(f'{self.pos[i]:2}' , end=" ")
        print()

    def set(self, i : int) -> None:
        # i 열에 퀸을 배치하는 함수이다
        for j in range(self.size):
            self.pos[i] = j
            if i == self.size-1:
                self.put()
            else:
                self.set(i+1)

queen = Queen(5)
queen.set(0)