def check(data):
    if len(data) % 2  == 0:
        idx = 0
        while( idx <= len(data)//2 ):
            if data[idx] != data[-idx-1]:
                return False
            idx += 1
        return True

    else:
        print("odd")
        idx = 0
        while( idx <= len(data)//2  ):
            print(idx)
            if data[idx] != data[-idx-1]:
                print(idx)
                return False
            idx += 1
        return True


def check2 (data):
    if len(data) <= 1:
        return True
    
    if data[0] == data[-1]:
        return check2(data[1:-1])
    else:
        return False

print(check2("kckck"))