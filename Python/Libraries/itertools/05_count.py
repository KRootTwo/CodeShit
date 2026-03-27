import itertools as it

counter = it.count() # returns an iterator
counter = it.count(start = 5, step = 2)
counter = it.count(start = 5, step = -2)


# print (next (counter))
# print (next (counter))
# print (next (counter))
# print (next (counter))

# for i in counter :
#     print (i)

data = [100, 200, 300, 400]

dat = list( zip (it.count(), data))

# print(dat)


