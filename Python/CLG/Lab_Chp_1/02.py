'''
2. Basic Set Operations
[resume]
    1. Write a program to verify the following set identities for given sets A, B, and C:
    A ∪ (B ∩ C) = (A ∪ B) ∩ (A ∪ C),
    A ∩ (B ∪ C) = (A ∩ B) ∪ (A ∩ C).
    2. Using a program, demonstrate the following set operations:
    • Union
    • Intersection
    • Difference
    • Symmetric Difference
'''
# A = {1, 2, 3}
# B = {2, 3, 4}
# C = {3, 4, 5}

# 1

A = set(map(int, input("Enter set A: ").split(" ")))
B = set(map(int, input("Enter set B: ").split(" ")))
A = set(map(int, input("Enter set A: ").split(" ")))
B = set(map(int, input("Enter set B: ").split(" ")))
C = set(map(int, input("Enter set C: ").split(" ")))


# A ∪ (B ∩ C) = (A ∪ B) ∩ (A ∪ C)

l1 = A | (B & C)
r1 = (A | B) & (A | C)

print(l1 == r1)

# A ∩ (B ∪ C) = (A ∩ B) ∪ (A ∩ C)

l2 = A & (B | C)
r2 = (A & B) | (A & C)

print(l2 == r2)

# 2

A = set(map(int, input("Enter set A: ").split(" ")))
B = set(map(int, input("Enter set B: ").split(" ")))

print ("Union: ", A | B)
print ("Intersection: ", A & B)
print ("Difference: ", A - B)
print ("Symmetric difference: ", A ^ B)
