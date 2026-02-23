# Write a Python program to check whether A = {1, 2} is a subset of B = {1, 2, 3, 4}.

A = {1, 2}
B = {1, 2, 3, 4}

isSubset = all(i for i in A if i in B)
print(isSubset)