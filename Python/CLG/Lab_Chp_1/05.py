'''
5. Functions
[resume]
    1. Write a program to verify whether a given relation is a function.
    2. Given a function f : A → B, write a program to check whether it is: (user input:
    f, A, B)
    • Injective (One-to-One)
    • Surjective (Onto)
    • Bijective
    3. f = (1, 4), (2, 4), (3, 8), (4, 6), (5, 2). Write a program to find the domain,
    codomain, and range of a given function, f.
    4. Implement and verify the following types of functions:
    • Identity function
    • Constant function
'''

# 1
# Each input must map to only ONE output

A = [1, 2, 3]
h = {(1, 1), (1, 2), (2, 2), (2, 1), (3, 3)}

def is_func (rel) :
    return all(j == k or i != k for (i, j) in rel for (k, l) in rel)

print (is_func(h))