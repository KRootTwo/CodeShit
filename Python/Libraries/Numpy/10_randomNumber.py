import numpy as np 

randGen = np.random.default_rng()

# print(randGen.integers(low = 1, high = 101, size = (3, 2)))

# randJen = np.random.default_rng(seed = 0)

# ## Just like fucking MINECRAFT. u set a seed & get the same results. MINECRAFT SUPREMACY WOOOOOOOOOO

# print(randJen.integers(1, 101, (3, 3)))

# print(np.random.uniform()) ## defaults b/w 0 & 1. Floating point values only

# print(np.random.uniform(-1, 1, (3, 2))) 

# np.random.seed(seed = 2)

# print(np.random.uniform()) 

#############################################################################

arr = np.array([1, 2, 3, 4, 5])
randGen.shuffle(arr)
print(arr)

fruits = np.array(["Mango", "Orange", "Peach", "Grape", "Apple", "Raspberry", "Durian", "Pomegranate", "Papaya", "Banana", "Watermelons", "Pineapple", "Dragon-fruit", "Apricot", "Strawberry", "Kiwi"])

fruit = randGen.choice(fruits)
fruit = randGen.choice(fruits, size = 3)
fruit = randGen.choice(fruits, size = (3, 3))

print(fruit)