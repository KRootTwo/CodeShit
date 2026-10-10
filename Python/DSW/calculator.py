def add(a, b):
    return a + b

def sub(a, b):
    return a - b

def mul(a, b):
    return a * b

def div(a, b):
    if b == 0:
        return "Can't divide by zero"
    return a / b

if __name__ == "__main__":
    print("Testing calculator directly:")
    print("10 + 5 =", add(10, 5))
    print("10 - 5 =", sub(10, 5))
