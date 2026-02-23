A = {1, 2, 3, 4, 5, 6}
B = {4, 5, 6, 7, 8, 9}

union = {i for s in [A, B] for i in s}
intersection = {i for i in A if i in B}
difference = {i for i in A if i not in B}


print(union)
print(intersection)
print(difference)