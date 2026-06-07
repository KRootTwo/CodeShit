# Print truth table for F(A,B,C)

print("A B C | F(A,B,C)")
print("------------------")

# Loop over all combinations (0 and 1)
for A in [0, 1]:
    for B in [0, 1]:
        for C in [0, 1]:
            # Compute expression
            F = (A and B) or ((not A) and C) or (B and C)

            # Convert boolean to int (0/1)
            F = int(F)

            print(A, B, C, "|", F)


#########