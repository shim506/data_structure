#트리 순회

size = int(input())
tree = dict()

class Node:
    def __init__(self , data , left_node , right_node) -> None:
        self.data = data
        self.left_node  = left_node
        self.right_node = right_node

def pre_order(node:Node):
    print(node.data , end="")
    if node.left_node != ".":
        pre_order(tree[node.left_node])
    if node.right_node != "." :
        pre_order(tree[node.right_node])
    

def mid_order(node:Node):
    if node.left_node != ".":
        mid_order(tree[node.left_node])
    print(node.data , end="")
    if node.right_node != "." :
        mid_order(tree[node.right_node])
    
def post_order(node:Node):
    if node.left_node != ".":
        post_order(tree[node.left_node])
    if node.right_node != "." :
        post_order(tree[node.right_node])
    print(node.data , end="")


for i in range(size):
    data , left , right = input().split()
    tree[data] = Node(data , left , right)
start_node = tree["A"]

pre_order(start_node)
print()
mid_order(start_node)
print()
post_order(start_node)



