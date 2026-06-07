import itertools

# List all truth possibilities for 3 variables (1 = True, 0 = False)
combinations = list(itertools.product([1, 0], repeat=3))

alpha_f = []

print("x1 x2 x3 | f(x1, x2, x3)")
print("-" * 23)
for x1, x2, x3 in combinations:
    # Evaluate sub-expressions manually for clarity
    not_x2 = 1 - x2
    not_x3 = 1 - x3

    left_side = (x1 or not_x2) and not_x3
    right_side = x1 ^ x3  # XOR operation

    # Material implication (p -> q) is equivalent to (not p or q)
    f_val = int(not left_side or right_side)
    alpha_f.append(f_val)

    print(f"{x1}  {x2}  {x3}  | {f_val}")

print("\nVector values alpha_f:", tuple(alpha_f))