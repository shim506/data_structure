class Heap:
    def __init__(self , data) -> None:
        self.heap_array = list()
        
        # index 0 은 비어있지만 복잡도를 위해  None을 넣는다
        self.heap_array.append(None)
        self.heap_array.append(data)

    def move_up(self , inserted_idx):
        if inserted_idx <= 1:
            return False
        parent_idx = inserted_idx // 2 
        if self.heap_array[inserted_idx] > self.heap_array[parent_idx]:
            return True
        return False


    def insert(self, data):
        self.heap_array.append(data)     
        inserted_idx = len(self.heap_array)-1

        while self.move_up(inserted_idx):
            parent_idx = inserted_idx // 2 
            self.heap_array[inserted_idx] , self.heap_array[parent_idx] = self.heap_array[parent_idx] , self.heap_array[inserted_idx] 
            inserted_idx = parent_idx


    def move_down(self , poped_idx):
        left_poped_idx  = poped_idx *2
        right_poped_idx  = poped_idx *2 +1

        # case : 자식 노드가 0개 1개 2개 일때 
        if left_poped_idx >= len(self.heap_array):
            return False
        elif right_poped_idx >= len(self.heap_array):
            if self.heap_array[left_poped_idx] > self.heap_array[poped_idx]:
                return True
            return False
        else:    
            if self.heap_array[left_poped_idx] < self.heap_array[right_poped_idx]:
                if self.heap_array[left_poped_idx] > self.heap_array[poped_idx]:
                    return True
                return False
            else:
                if self.heap_array[left_poped_idx] > self.heap_array[poped_idx]:
                    return True
                return False



    def pop(self):
        if len(self.heap_array) <= 1:
            return None
        
        returned_data = self.heap_array[1]
        self.heap_array[1] = self.heap_array[-1]
        del self.heap_array[-1]
        popped_idx = 1
        
        while self.move_down(popped_idx):
            left_child_popped_idx = popped_idx * 2
            right_child_popped_idx = popped_idx * 2 + 1

            # case2: 오른쪽 자식 노드만 없을 때
            if right_child_popped_idx >= len(self.heap_array):
                if self.heap_array[popped_idx] < self.heap_array[left_child_popped_idx]:
                    self.heap_array[popped_idx], self.heap_array[left_child_popped_idx] = self.heap_array[left_child_popped_idx], self.heap_array[popped_idx]
                    popped_idx = left_child_popped_idx
            # case3: 왼쪽, 오른쪽 자식 노드 모두 있을 때
            else:
                if self.heap_array[left_child_popped_idx] > self.heap_array[right_child_popped_idx]:
                    if self.heap_array[popped_idx] < self.heap_array[left_child_popped_idx]:
                        self.heap_array[popped_idx], self.heap_array[left_child_popped_idx] = self.heap_array[left_child_popped_idx], self.heap_array[popped_idx]
                        popped_idx = left_child_popped_idx
                else:
                    if self.heap_array[popped_idx] < self.heap_array[right_child_popped_idx]:
                        self.heap_array[popped_idx], self.heap_array[right_child_popped_idx] = self.heap_array[right_child_popped_idx], self.heap_array[popped_idx]
                        popped_idx = right_child_popped_idx
        return returned_data
heap = Heap(15)
heap.insert(10)
heap.insert(8)
heap.insert(5)
heap.insert(4)
heap.insert(20)
print(heap.pop())
#print(heap.heap_array)

