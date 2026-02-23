# Consider the set {1, {1}, 2}. Write a Python example to demonstrate element mem-
# bership using the in operator.

A = {1, frozenset({1}), 2} 
A = list(A)

# mem = {i for n in A for i in n if isinstance(n, set)} | {i for i in A if isinstance(i, int)}
# print(mem)

print(1 in A)
print(3 in A)
print({1} in A)

# frozenset is immutable. sets are mutable in python cuz u can do .add()
# .remove kinda things. here using frozenset is the correct logic



