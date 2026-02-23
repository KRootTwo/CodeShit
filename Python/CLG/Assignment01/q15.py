# Write a Python program to remove an element from a set safely.

B = set(i for i in range (10, 21))
B = list(B)

# B.remove(12) # not safe bruhh
del B[2]

B = set(B)

print()