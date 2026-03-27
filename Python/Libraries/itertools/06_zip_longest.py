import itertools as it 

data = [100, 200, 300, 400]

dat = list( it.zip_longest (range(10), data))

print(dat)