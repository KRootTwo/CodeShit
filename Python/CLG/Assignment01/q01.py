#  Create two Python sets A = {1, 2, 3} and B = {3, 4, 5}. Write a Python program
# to compute the union of A and B.

A = {1, 2, 3} 
B = {3, 4, 5}

union = {i for n in [A, B] for i in n}
print(union)