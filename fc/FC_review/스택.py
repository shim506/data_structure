# 스택은 lifo (후입 선출에 기초한다)
stack_list = list()

def push(data):
    stack_list.append(data)

def pop():
    data = stack_list[-1]
    del stack_list[-1]
    return data