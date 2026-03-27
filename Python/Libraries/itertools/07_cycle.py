import itertools as it

counter = it.cycle([1, 2, 3, 4, 5])
counter = it.cycle(("blehh", "poo"))

print (next(counter))
print (next(counter))
print (next(counter))
print (next(counter))
print (next(counter))
print (next(counter))
print (next(counter))
print (next(counter))
print (next(counter))

