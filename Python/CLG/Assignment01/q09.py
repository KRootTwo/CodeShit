# Write a Python program to compute the power set of {a, b}.

S = {'a', 'b'}
E = []
E.append('{}')

for i in S :
    E.append({i})

for i in S :
    for j in S :
        if (i != j and {i, j} not in E) :
            E.append({i, j})
print(E)