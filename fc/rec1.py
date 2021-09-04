#factorial


def factorial(n :int):
    if n > 1:
        return n * factorial(n-1)
    else:
        return 1


print(factorial(3))