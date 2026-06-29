# S = [1, 2, 3]
# R = [(1, 2), (1, 1), (2, 2), (3, 3), (2, 1)]

# refl = all((i, i) in R for i in S)
# symm = all((i, j) in R for (j, i) in R)
# tran = all((a, c) in R for (a, b1) in R for (b2, c) in R if b1 == b2)

# print(f"{refl}")
# print(f"{symm}")
# print(f"{tran}")

# A = set(map(int, input("Entre: " ).split()))

A = {1, 2, 3, 4, 5}
B = {'a', 'b', 'c', 'd', 'e'}

f = {
    1:'a',
    2:'b',
    3:'c',
    4:'d',
    5:'e'
}

images = {}
inj = True
 
for x, y in f.items():
    if y in images.values():
        if x not in images or images.get(x) != y:
            inj = False
            break
    images[x] = y

img_set = set([b for b in f.values()])
sur = (img_set == B)

'''
F(A,B,C) = (A∧B)∨(¬A∧C)∨(B∧C)
'''

from sympy import symbols
from sympy.logic.boolalg import And, Or, Not, simplify_logic

A, B, C = symbols('A B C')

F = (A & B) | (~A & C) | (B & C)

F_simplified = simplify_logic(F, form='dnf')

print(f"{F}\n{F_simplified}\n")











