import numpy as np 

arr1 = np.array('A')
print(arr1.ndim)
print(arr1.shape)

arr1 = np.array(['A', 'B', 'C'])
print(arr1.ndim)
print(arr1.shape)

arr1 = np.array([['A', 'B', 'C'], 
                ['D', 'E', 'F'],
                ['G', 'H', 'I']])
print(arr1.ndim)
print(arr1.shape)

arr1 = np.array([[['A', 'B', 'C'], ['D', 'E', 'F'], ['G', 'H', 'I']],
                [['J', 'K', 'L'], ['M', 'N', 'O'], ['P', 'Q', 'R']],
                [['S', 'T', 'U'], ['V', 'W', 'X'], ['Y', 'Z', ' ']]])
print(arr1.ndim)
print(arr1.shape)

arr1 = np.array([[['A'], 
                ['B'],
                ['C']]])
print(arr1.ndim)
print(arr1.shape)


