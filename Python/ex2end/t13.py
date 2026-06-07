'''
Using Pyhton check whether the Boolean functions f and g are equivalent or not!
f (x1 , x2 ) = (x1 → x2 ) ∧ (x2 → x1 ), and g(x1, x2 ) = x1.
'''

from sympy.logic.boolalg import truth_table, Implies, Equivalent, simplify
from sympy.abc import x1, x2

f = Implies(x1, x2) & (x2, x1) 
g = x1

for row in truth_table(Equivalent(f, g), [x1, x2]) :
    vals = [1 if x else 0 for x in row[0]]

    f_val = int(bool(f.subs({x1: vals[0], x2: vals[1]})))
    g_val = int(bool(g.subs({x1: vals[0]})))

