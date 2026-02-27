'''
4. Relations
[resume]
    1. Write a program to represent a relation R on a set A using:
    • Ordered pairs
    • Matrix representation
    2. Given a relation R, write a program to check whether it is:
    • Reflexive
    • Symmetric
    • Transitive
    3. Write a program to check whether a relation is an equivalence relation or not.
#    ∈ or ∉ 
#    Conjunction: ∧, &: and. Disjunction: ∨, v: or.
'''

# 1

# Suppose Relation = {(a, b) | a, b ∈ A ∧ a < b}

A = [1, 2, 3]
r = {(a, b) for a in A for b in A if a < b}

print(r)

# Matrix

for i in A :
    for j in A :
        if ((i, j) in r) :
            print(1, end=" ")
        else :
            print(0, end=" ")
    print()

# 2

A = [1, 2, 3]
r = {(a, b) for a in A for b in A if a < b}

def is_rflxve(rel, Set) :
    for i in Set :
        if (i, i) not in rel :
            return False
    return True
        
def is_symm(rel, Set) :
    for i in Set :
        for j in Set :
            if ((i, j) in rel) and ((j, i) not in rel) :
                return False
    return True

def is_trans(rel, Set) :
    for i in Set :
        for j in Set :
            for k in Set :
                if ((i, j) in rel) and ((j, k) in rel) and ((i, k) not in rel) :
                    return False
    return True

h = {(1, 1), (1, 2), (2, 2), (2, 1), (3, 3)}
# print(is_trans(h, A))

def rfx (rel, Set) :
    return all((i, i) in rel for i in Set)

def sym (rel, Set) :
    return all((j, i) in rel for (i, j) in rel)

def tsv (rel, Set) :
    return all((i, j) in rel for (i, x) in rel for (y, j) in rel if x == y)

print (rfx(h, A))
print (sym(h, A))
print (tsv(h, A))

def eqiv(rel, Set) :
    return (rfx(h, A)) and (sym(h, A)) and (tsv(h, A))

print(eqiv(h, A))











'''
all(condition for ...)

Reflexive rule => If element i exists → (i,i) must be in relation
Symmetric rule => If (i,j) ∈ R → (j,i) must also be in R
Transitive rule => If (i,j) and (j,k) exist → j must be SAME
Antisymmetric rule => If (i,j) and (j,i) exist → i must equal j
Asymmetric rule => If (i,j) exists → (j,i) must NOT exist
Irreflexive rule => For every i → (i,i) must NOT exist

Equivalence Relation
Must satisfy:
Reflexive + Symmetric + Transitive

Partial Order
Must satisfy:
Reflexive + Antisymmetric + Transitive

-----------------------------------------
Reflexive     → (i,i) must exist
Irreflexive   → (i,i) must NOT exist

Symmetric     → (i,j) ⇒ (j,i)
Antisymmetric → (i,j) & (j,i) ⇒ i=j
Asymmetric    → (i,j) ⇒ NOT (j,i)

Transitive    → (i,j) & (j,k) ⇒ (i,k)
-----------------------------------------


'''

