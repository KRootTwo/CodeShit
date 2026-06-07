A = {1, 2, 3, 4}
R = {(1, 1), (1, 2), (2, 3), (3, 4)} 

rflxv = all((a, a) in R for a in A)

symm = all((a, b) in R for (b, a) in R)

trans = all((a, c) in R for (a, b) in R for (d, c) in R if b == d)

print(rflxv)
print(symm)
print(trans)