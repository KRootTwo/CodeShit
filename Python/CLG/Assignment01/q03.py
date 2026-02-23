# Let the universal set be U = {1, 2, 3, 4, 5} and A = {1, 2}. Write Python code to
# compute the complement of A with respect to U .

U = {1, 2, 3, 4, 5}
A = {1, 2}

cmplmAwrU = {i for i in U if i not in A}
print(cmplmAwrU)