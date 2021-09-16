# 0만들기
import copy

def make_operate_list(lst:list , val):
    if len(lst) == val:
        operators_list.append(copy.deepcopy(lst))
        return
    else:
        lst.append("+")
        make_operate_list(lst , val)
        lst.pop()

        lst.append("-")
        make_operate_list(lst , val)
        lst.pop()
        
        lst.append(" ")
        make_operate_list(lst ,val)
        lst.pop()
        
    
test = int(input())

for i in range(test):
    operators_list = []

    val = int(input())

    integers =[i for i in range(1 , val+1)]

    temp_operation_list = list()
    make_operate_list(temp_operation_list , val-1)

    for operators in operators_list:
        string = ""
        for i in range(val -1):
            string += str(integers[i]) + operators[i]
        string += str(integers[-1])
        if eval(string.replace(" ", "")) == 0:
            print(string)
    print()
