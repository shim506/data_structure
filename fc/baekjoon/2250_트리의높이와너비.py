size = int(input())
dic = dict()

class Node:
    def __init__(self , head ,left , right ) -> None:
        self.head  = head
        self.left = left
        self.right = right
        

for i in range(size):
    head , left , right = map(int , input().split())
    