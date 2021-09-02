# double linked list 는 next , prev 를 통해 
# 앞 또는 뒤에서 부터 원하는 곳에서 부터 검색할 수 있다
# sort가 되어있다면 시간을 단축 시킬 수 있다.

class Node:
    def __init__(self ,data , prev= None , next = None ) -> None:
        self.data  = data
        self.prev = prev
        self.next = next
    
class Node_mng:
    def __init__(self , data) -> None:
        self.head = Node(data)
        self.tail = self.head
            
    def insert(self, data):
        
        if self.head == None:
            self.head = Node(data)
            self.tail = self.head
        else :
            node = self.head
            while node.next:
                node = node.next
            new = Node(data)
            self.tail = new
            node.next = new
            new.prev = node
    def desc(self):
        node = self.head
        while node:
            print(node.data)
            node = node.next
    def search_from_head(self , data):
        if self.head == None:
            return False
        node = self.head
        while node:
            if node.data == data:
                return node
            else:
                node = node.next
        return False
    def search_from_tail(self , data):
        if self.head == None:
            return False
        node = self.tail
        while node:
            if node.data == data:
                return node
            else:
                node = node.prev
        return False

    def insert_before(self , data , before_data):
        if self.head == None:
            self.head = Node(data)
            return True
        else:
            node = self.tail
            while node.data != before_data:
                node = node.prev
                if node == None:
                    return False
            new = Node(data)
            
            before_node  = node.prev
            before_node.next = new

            new.next = node
            new.prev = before_node

            node.prev = new
            return True

    def insert_after(self, data , after_data):
        if self.head == None:
            self.head = Node(data)
            return True
        else:
            node = self.head
            while node:
                if node.data == after_data:
                    new = Node(data)       
                    if(node.next != None):
                        next_node = node.next
                        next_node.prev = new
                        new.next = next_node
                    node.next = new
                    new.prev = node
                    return True           
                else:
                    node = node.next

node_mgmt = Node_mng(0)
for data in range(1, 10):
    node_mgmt.insert(data)

node_mgmt.desc()

node_mgmt.insert_after(1.5, 1)
node_mgmt.desc()
        
        