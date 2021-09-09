
class Node:
    def __init__(self , data ) -> None:
        self.data = data
        self.next = None


class mng_Node:
    def __init__(self , data ) -> None:
        self.parent = Node(data)
    
    def insert(self, data):
        node = self.parent
        while node.next != None:
            node = node.next
        node.next = Node(data)
    
    def desc(self):
        node = self.parent
        while node.next != None:
            print(node.data)
            node = node.next
        print(node.data)

    def dlt(self, data):
        node = self.parent
        parent_node = self.parent

        if parent_node.data == data:
            self.parent = parent_node.next 
            del parent_node
            return True
        else:
            while node.next != None:
                if (node.data == data):
                    temp = node
                    parent_node.next = node.next
                    del(temp)
                    return True
                parent_node = node
                node =node.next

            if node.data != data:
                return False
            else:
                parent_node.next = None
                del(node)
                return True



lkd_list = mng_Node(20)
lkd_list.insert(10)
lkd_list.insert(30)
lkd_list.dlt(10)
lkd_list.insert(20)
lkd_list.insert(80)

lkd_list.desc()