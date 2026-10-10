l = [1, 2, 3, 4, 5, 6]

def lar(a):
    mx = l[0]
    for i in l:
        if i > mx:
            mx = i
    return mx

print(lar(l))

# print([x for x in range(1, 101)])

def maxx(a, b):
    if a > b:
        return a
    else :
        return b

mx = lambda x, y: x if x > y else y

print(f"{maxx(99, 999)}")
print(f"{mx(99, 999)}")
