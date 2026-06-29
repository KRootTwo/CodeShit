# from sympy import symbols
# from sympy.logic.boolalg import simplify_logic

# P, Q = symbols('P Q')

# F = (P >> Q) & (~P | Q)

# F_simplified = simplify_logic(F)

# def fn(p, q):
#     return F.subs({P: p, Q: q})

# for i in [0, 1]:
#     for j in [0, 1]:
#         print(f"{i} \t {j} \t {int(bool(fn(i, j)))}")


# def rel(a, b) :
#     return ((a - b) % 2 == 0)


# ## ------------------------------------------------

# S = [1, 2, 3]
# R = [(1, 2), (1, 1), (2, 2), (3, 3), (2, 1)]




# ref = all((i, i) in R for i in S)
        
# def refl(R, S):
#     for i in S: 
#         if (i, i) not in R:
#             return False
#     return True

# def symm(R):
#     for (i, j) in R:
#         if (j, i) not in R:
#             return False
#     return True

is_even = (lambda x: x % 2 == 0)

A = set([1, 2, 3, 4])
B = set([5, 6, 7, 2])

u = A.union(B)

ls = []

for i in A:
    if i in B:
        ls.append(i)
        


print(f"{ls}")

print(f"{u}")