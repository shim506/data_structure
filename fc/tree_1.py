class Node:
    def __init__(self , value) -> None:
        self.value =value
        self.left = None
        self.right = None

# head 는 노드를 받는 구조
class NodeMgnmt:
    def __init__(self , head) -> None:
        self.head = head

    def insert(self, value):
        self.current_node = self.head
        while True:
            if value < self.current_node.value:
                if self.current_node.left != None:
                    self.current_node = self.current_node.left
                else:
                    self.current_node.left = Node(value)
                    break
            else:
                if self.current_node.right != None:
                    self.current_node = self.current_node.right
                else:
                    self.current_node.right = Node(value)
                    break

    def search(self, value):
        self.current_node = self.head
        while self.current_node:
            if self.current_node.value == value:
                return True
            ## 만약 존재하지 않는값이 current_node 에 저장되면 (None)
            # while문의 조건에 의해 종료된다
            elif value < self.current_node.value:
                self.current_node = self.current_node.left
            else: self.current_node = self.current_node.right
        return False

    def delete(self, value):
        searched =False
        self.current_node = self.head
        self.parent = self.head
        while self.current_node:
            if self.current_node.value == value:
                searched = True
                break
            elif value < self.current_node:
                self.current_node = self.current_node.left
                self.parent = self.current_node
            else:
                self.current_node = self.current_node.right
                self.parent = self.current_node
        if searched == False:
            return False
        
        ## 이후 부터 Case 를 분리해서
        

        



head = Node(1)
BST = NodeMgnmt(head)
BST.insert(2)
BST.insert(5)
BST.insert(4)
BST.insert(6)
BST.insert(12)
BST.insert(22)

print(BST.search(16))


