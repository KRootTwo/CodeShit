'''
3. De Morgan’s Laws
[resume]
1. Write a program to verify De Morgan’s Laws:
(A ∪ B)′ = A′ ∩ B ′ ,
(A ∩ B)′ = A′ ∪ B ′ .
2. Take user-defined sets A, B, and a universal set U and validate De Morgan’s Laws
computationally.
'''

U = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12, 13, 14, 15}
A = {1, 2, 3, 4, 5, 6, 7}
B = {4, 5, 6, 7, 8, 9, 0}

# 1

# U = set( map (int, input ("Enter Univ set: ").split(" ")))
# A = set( map (int, input ("Enter A set: ").split(" ")))
# B = set( map (int, input ("Enter B set: ").split(" ")))

# (A ∪ B)′ = A′ ∩ B ′ 

l1 = U - (A | B)
r1 = (U - A) & (U - B)

print(l1 == r1)

# (A ∩ B)′ = A′ ∪ B ′ 

l2 = U - (A & B)
r2 = (U - A) | (U - B)

print(l2 == r2)

# 2

# U = set( map (int, input ("Enter Univ set: ").split(" ")))
# A = set( map (int, input ("Enter A set: ").split(" ")))
# B = set( map (int, input ("Enter B set: ").split(" ")))

# (A ∪ B)′ = A′ ∩ B ′ 

l1 = {i for i in U if i not in {j for n in [A, B] for j in n}}
r1 = {i for i in U if i not in A and i not in B}

print (l1 == r1)

# (A ∩ B)′ = A′ ∪ B ′ 

l2 = {i for i in U if i not in {j for j in A if j in B}}
r2 = {i for i in U if i not in A or i not in B}

print (l2 == r2)
