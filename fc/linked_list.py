# 노드의 추가 와 순회 보여주기 구현


class Node():
    def __init__(self , data , next = None) -> None:
        self.data = data
        self.next = next
class Node_mng():
    def __init__(self , data) -> None:
        self.head = Node(data)

    def add(self , data)->None :
        if self.head =="":
            self.head = Node(data)
        else:
            node = self.head
            while node.next:
                node = node.next
            node.next = Node(data)
    
    def desc(self):
        node = self.head
        while node.next:
            print(node.data)
            node = node.next


likedlist1 = Node_mng(0)
likedlist1.add(2)
likedlist1.add(12)
likedlist1.add(22)
likedlist1.add(32)

likedlist1.desc()

