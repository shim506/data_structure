# 0 만들기
import copy



def recurr(array :list  , n):
    if len(array) == n :
        operators_list.append(copy.deepcopy(array))
        return
    else:
        array.append(" ")
        recurr(array , n)
        array.pop()

        array.append("+")
        recurr(array , n)
        array.pop()

        array.append("-")
        recurr(array , n)
        array.pop()



test = int(input())

lst = list()

for i in range(test):
    operators_list = []

    val = int(input())
    integers = [x for x in range(1 , val+1)]
    
    array = list()
    recurr (array , val-1)

    for operators in operators_list:
        string = ""
        for i in range(val -1):
            string += str(integers[i]) + operators[i]
        string += str(integers[-1])
        if eval(string.replace(" " , "")) == 0:
            print(string)
    print()



