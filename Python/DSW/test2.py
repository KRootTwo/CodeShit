import numpy as np
import random

a = np.arange(10, 22).reshape(3, 4)
b = np.arange(10, 22).reshape(4, 3)

print(f"{a}\n\n{b}\n")

# print(f"{a + b}")

D = dict()

def fun (D, p, q):
    if p < q:
        D[p], D[q] = D[q], D[p]
        fun (D, p + 1, q - 1)
l = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
fun(l, 3, 10)

print(l)

def f(a, b) :
    if a == 0: return b
    if a % 2 == 1:
        return 2 * f((a - 1)/2, b)
    return b + f((a - 1), b)

print(f"{f(15, 10)}")

rng = np.random.default_rng()

l = rng.uniform(low = 0, high = 5, size = ())

print(l)