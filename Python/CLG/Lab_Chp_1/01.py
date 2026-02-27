'''
1. Sets and Set-Builder Notation
Note: All input should be user-defined
1. Write a program to input two finite sets A and B and compute:
• A ∪ B
• A ∩ B
• A − B
• B − A
2. Given a universal set U and a set A, write a program to find the complement of A.
3. Write a program to generate a set using set-builder notation:
A = {x ∈ N | x ≤ 20 and is even}.
4. Write a program to verify whether a given set is an empty set, singleton set, or
finite set.
'''

# 1

# A = set(map(int, input("Enter numero: ").split()))
# B = set(map(int, input("Enter numero: ").split()))

U = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12, 13, 14, 15}
A = {1, 2, 3, 4, 5, 6, 7}
B = {4, 5, 6, 7, 8, 9, 0}

AunionB = set(i for n in [A, B] for i in n)
AintsecB = set(i for i in A if i in B)
AdiffB = set(i for i in A if i not in B)
BdiffA = set(i for i in B if i not in A)

print(AunionB)
print(AintsecB)
print(AdiffB)
print(BdiffA)

# 2

# U = set(map(int, input("Enter Uiiv set: ").split()))
# A = set(map(int, input("Enter set A: ").split()))

Acomp = {i for i in U if i not in A}

print(Acomp)

# 3

D = {i for i in range (1, 21) if i % 2 == 0} 

# 4

E = set()
S = {0}

def setLen(q) :
    if (len(q) == 0) :
        print("%s is an Empty set" % q) 
    elif (len(q) == 1) :
        print("%s is a Singleton set" % q) 
    else :
        print("%s is a Finite set" % q) 

setLen(E)
setLen(S)
setLen(A)