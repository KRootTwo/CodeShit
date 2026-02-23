# Suppose two disjoint sets have sizes |A| = 4 and |B| = 5. Write Python code to
# verify that |A ∪ B| = 9.

A = {1, 2, 3, 4, 5}
B = {6, 7, 8, 9}

print(len(A), " ", len(B))

intersection = {i for i in A if i in B}
print(intersection)

union = {i for n in [A, B] for i in n}
print(union)
print(len(union))