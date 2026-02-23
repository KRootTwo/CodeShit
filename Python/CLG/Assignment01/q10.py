# Given A = {1, 2, 3} and A − B = {1, 2}, write Python code to determine the set B.

A = {1, 2, 3}
B = set()

# A - B = {1, 2} 
# => A ints B^c = {1, 2} 

AdiffB = {1, 2}

B = A - AdiffB
B = {i for i in A if i not in AdiffB}

print(B)



