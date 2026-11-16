import numpy as np 
import pandas as pd 
import matplotlib.pyplot as plt 
import random as rand
import re 
import functools as ftl

s = 'abc'

r = r'\d+'

print(re.search(r, s))
print(re.match(r, s))

a = 'fuck'
b = 'nigga'
c = 67

print("%s %s" % (a, b))
print("%s" % c)

print("{} {}".format(a, b))
print("{1} {0}".format(a, b))
print("{d} {c}".format(c = a, d = b))

print(eval("7+9-9"))

def f(a, b) :
    print("{} {}".format(a, b))

f(3, b = 9)
print("---------------------------------")
l = [1, 6, 5, 3, 8, 3, 0]

print(rand.randint(0, 9))
print(rand.randrange(0, 9))
print(rand.choice(l))
print(rand.shuffle(l))
print(l)
print(rand.sample(l, 5))

print("---------------------------------")

for i in range (0, 9) :
    print(f"{i}")

# l = eval(input("l:"))
l = [1, 6, 5, 3, 8, 3, 0]
print(f"{l}")

l.sort(key = lambda x: x > 3, reverse = True)
print(f"{l}")

print("---------------------------------")

l2 = [[2, 3], 9]

m = l2

m[0][0] = 1
m[1] = 8

print(f"{l2}")

print("---------------------------------")

l = [1, 2, 3, 4, 5]

res = list(map(lambda x: x + 10 if x < 3 else x * 10, l))
print(f"{res}")

print(ftl.reduce(lambda x, y: x if x > y else y, l))

t1 = [True, False, True, False]
t2 = [True, True, True, True, True]
t3 = [False, False, False, False, False]

print(all(t1))
print(all(t2))
print(all(t3))

print(f"")

print(any(t1))
print(any(t2))
print(any(t3))

l = [[[1, 2, 3], [7, 8, 9]],
    [[4, 5, 6], [1, 2, 3]],
    [[7, 8, 9], [4, 5, 6]]]

print(f"{l}")
print(l[0][0][0])

print()

L = [[0, 1],
    [10, 11]]

print(L[0][1])
print([0][:])
print()
print()

print("---------------------------------")

print(np.identity(4))
print(np.eye(4, k = -1))

print(np.identity(4).size)

print(np.zeros((2, 3)))
print(np.zeros((2, 3, 4)))

l = np.arange(10)
p = l[2 : 5]

p[0] = 9
print(f"{l}")

