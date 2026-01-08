import numpy as np

"""
Broadcasting allows Numpy to perform operations on Arrays
with different shapes by virtually expanding dimensions
so they match the larger arrays shape

The dimensions have the same size 
OR
One of the dimensions has a size of 1
"""

array1 = np.array([[1, 2, 3, 4]])
array2 = np.array([[1],[2],[3],[4]])

print(array1.shape)
print(array2.shape)

array3 = array1 * array2

print(array3.shape)
print(array3)

array1 = np.array([[1, 2, 3, 4, 5, 6, 7, 8, 9]])
array2 = np.array([[1], [2], [3], [4], [5], [6], [7], [8], [9]])

array3 = array1 * array2

print(array3)



"""
for succesfull broadcasting 
            (1, 4)
            (4, 1)
any of these ^  ^
should either be 1 or both should be equal 
i.e. 
        (1, 5)  (6, 5)  (2, 5)  (1, 5)
        (1, 1)  (6, 1)  (1, 5)  (1, 5)

"""