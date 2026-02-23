#  Write Python code to compute the set difference between two sets.

A = set(i for i in range (1, 10))
B = { 3, 4, 5}

AdiffB = {i for i in A if i not in B}

print(AdiffB)