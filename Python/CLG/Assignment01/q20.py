#  Write a Python program to count the number of elements present in a set.

A = {1, 2, 3, 4, 5, 6, 7, 8, 9}

# count = len(A) # Bruhh

count = 0
count = sum(1 for i in A)

print(count)