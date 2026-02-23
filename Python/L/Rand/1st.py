# [ expression for item in iterable if condition ]

r = []
for i in range(5):
    r.append(i * i)

t = [j * j for j in range(5)]

print(r)
print(t)


f = []
for i in range(10):
    if i % 2 == 0:
        f.append(i)

print (f) 

d = [i for i in range(10) if i % 2 == 0]

print (d)

l = [i * i for i in range(10) if i % 2 == 0]

print (l)