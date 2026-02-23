# Write a Python program to generate all subsets (power set) of the set {1, 2, 3}.

# A = set(map(int, input("Entre set A: ").split()))

S = {1, 2, 3, 4}
U = list(S)
E = []
# empty
E.append({})

# singles
for i in U:
    E.append({i})

# doubles
for i in U :
    for j in U :
        if (i != j and {i, j} not in E) :
            E.append({i, j})
     
#trebles
for i in U :
    for j in U :
        for k in U :
            if (i != j != k and {i, j, k} not in E) :
                E.append({i, j, k})

print(E)


