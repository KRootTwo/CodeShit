def rlfxv (S, R) :
    return all((i, i) in R for i in S)

def symmt (S, R) :
    return all((i, j) in R for (j, i) in R if i in S if j in S)

def trnst (S, R) :
    return all((i, j) in R for (i, x) in R for (y, j) in R if x == y if i in S if j in S if x in S if y in S)

A = {1, 2, 3}
H = {(1, 1), (1, 2), (2, 2), (2, 1), (3, 3)}
P = {(1, 1), (2, 2), (3, 3)}

L = {1, 2, 3, 4, 5} 
R = {(1, 2), (2, 3), (3, 4), (4, 5), (5, 1)}

print(rlfxv(L, R))
print(rlfxv(A, P))
print(symmt(A, H))
print(trnst(A, H))

