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
    def dlt(self , data ):
        # 1. 헤드가 없을때
        if self.head == None:
            print("리스트가 비어있습니다")
            return
        # 2. 마지막 노드 삭제
        # 3. 중간 노드 삭제
        else:
            node = self.head
            if node.data == data:
                self.head = node.next
                return
            else:
                while node.next.next != None :
                    if node.next.data == data:
                        temp = node.next
                        node.next = node.next.next
                        del temp
                        return
                    else :
                         node = node.next
                        

        
     
likedlist1 = Node_mng(0)
likedlist1.add(2)
likedlist1.add(12)
likedlist1.add(22)

likedlist1.add(32)
likedlist1.add(34)
likedlist1.dlt(34)
likedlist1.desc()

