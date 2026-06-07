from sympy.logic.boolalg import simplify_logic, truth_table
from sympy.abc import A, B, C

expr = (A & B) | (~A & C) | (B & C)

print("A  B  C | Output")
print()

for row in truth_table(expr, [A, B, C]) :
#   ([False, False, True], True)
    zerones = [1 if x else 0 for x in row[0]]
    ans = 1 if row[1] else 0
    print(zerones[0], zerones[1], zerones[2], ans)
