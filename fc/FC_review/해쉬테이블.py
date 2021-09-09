
class Node:
    def __init__(self , key,data ) -> None:
        self.key = key
        self.data = data
        self.next = None


class mng_Node:
    def __init__(self , key , data  ) -> None:
        self.parent = Node(key , data)
    
    def insert(self, key,data):
        node = self.parent
        while node.next != None:
            node = node.next
        node.next = Node(key ,data)
    
    def desc(self):
        node = self.parent
        while node.next != None:
            print(node.data)
            node = node.next
        print(node.data)

    def dlt(self, key):
        node = self.parent
        parent_node = self.parent

        if parent_node.key == key:
            self.parent = parent_node.next 
            del parent_node
            return True
        else:
            while node.next != None:
                if (node.key == key):
                    temp = node
                    parent_node.next = node.next
                    del(temp)
                    return True
                parent_node = node
                node =node.next

            if node.key != key:
                return False
            else:
                parent_node.next = None
                del(node)
                return True



table = list([mng_Node(None , None) for i in range(8)])


def hash_function(data):
    hash_address = data % 8
    return hash_address

def hash_add(key , data):
    hash_address = hash_function(key)
    linked_list = table[hash_address] # parent_node

    if linked_list.parent.key == None:
        linked_list.parent.key = key
        linked_list.parent.data = data
    else:
        linked_list.insert(key,data)

def read_data(key):
    hash_address = hash_function(key)
    linked_list = table[hash_address] # parent_node
    node = linked_list.parent

    while node != None:
        if node.key == key:
            print(node.data)
            return
        else:
            node = node.next
    if node.key != key:
        return False
    else: 
        print(node.data)
    

hash_add(10,10000)
hash_add(20,2000)
hash_add(30,300)
hash_add(50,500)
hash_add(60,600)

read_data(30)


'''
lkd_list = mng_Node(1,20)
lkd_list.insert(2,10)
lkd_list.insert(3,30)
lkd_list.dlt(2)
lkd_list.insert(5,20)
lkd_list.insert(8,80)

lkd_list.desc()
'''