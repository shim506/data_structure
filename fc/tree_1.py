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
        # 1.삭제 노드가 자식이 없는경우
        if self.current_node.left == None and self.current_node.right == None:
            if value < self.parent.value:
                self.parent.left = None
            else:
                self.parent.right = None
            del self.current_node 
        
        # 2. 삭제 노드가 자식 한개만을 가질때
        # 2-1 왼쪽 자식만 가질때
        if self.current_node.left != None and self.current_node.right == None:
            if value < self.parent.value:
                self.parent.left = self.current_node.left
            else:
                self.parent.right = self.current_node.left
        elif self.current_node.left == None and self.current_node.right != None:
            if value < self.parent.value:
                self.parent.left = self.current_node.right
            else:
                self.parent.right = self.current_node.right

        # 3.    삭제할 노드가 두개의 자식을 가질때(전략 -> 오른쪽 자식중 가장 왼쪽 node를 올리는 것 선택)
        # 3-1   삭제할 노드가 parent 왼쪽에 있을때
        # 3-1-1 올릴 노드(오른쪽 자식중 가장 왼쪽)에게 오른쪽 자식이 있을때 (왼쪽 자식이 있을 수는 없다)

        if self.current_node.left != None and self.current_node.right != None:
            if value < self.parent.value:
                self.select_node = self.current_node.right
                self.select_node_parnet = self.current_node.right
                while self.select_node.left != None:
                    self.select_node_parnet = self.select_node
                    self.select_node = self.select_node.left
                if self.select_node.right != None:
                    self.select_node_parnet.left =self.select_node.right
                else:
                    self.select_node_parnet.left = None

                self.parent.left = self.select_node
                self.select_node.right = self.current_node.right
                self.select_node.left = self.current_node.left
        # 3-2 parent 오른쪽에 지울 노드가 있을때
            else:
                self.select_node = self.current_node.right
                self.select_node_parnet = self.current_node.right
                while self.select_node.left != None:
                    self.select_node_parnet = self.select_node
                    self.select_node = self.select_node.left
                if self.select_node.right != None:
                    self.select_node_parnet.left =self.select_node.right
                else:
                    self.select_node_parnet.left = None

                self.parent.right = self.select_node
                self.select_node.right = self.current_node.right
                self.select_node.left = self.current_node.left
            return True




        



head = Node(1)
BST = NodeMgnmt(head)
BST.insert(2)
BST.insert(5)
BST.insert(4)
BST.insert(6)
BST.insert(12)
BST.insert(22)

print(BST.search(16))


