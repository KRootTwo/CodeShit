import numpy as np  

"""
arr1 = np.array(
           row 0            row 1            row 2  
    [[['A', 'B', 'C'], ['D', 'E', 'F'], ['G', 'H', 'I']], #Layer 0 
       c0   c1   c2     c0   c1   c2     c0   c1   c2   -- Columns       
    [['J', 'K', 'L'], ['M', 'N', 'O'], ['P', 'Q', 'R']],  #Layer 1
    [['S', 'T', 'U'], ['V', 'W', 'X'], ['Y', 'Z', '-']]] #LAyer 2
)
"""

arr1 = np.array(
    [[['A', 'B', 'C'], ['D', 'E', 'F'], ['G', 'H', 'I']],
     [['J', 'K', 'L'], ['M', 'N', 'O'], ['P', 'Q', 'R']],
     [['S', 'T', 'U'], ['V', 'W', 'X'], ['Y', 'Z', '-']]]
)

"""
Indexing Visualization (VERY IMPORTANT)
1-D
a[2]

2-D
a[row][col]

3-D
a[layer][row][col]


# Chain Indexing    
print(arr1[0][0][0])

Multidimensional Indexing (Faster)
# array[1, 2, 3] -> array[layer, row, column]
"""

##----------------##
print(arr1[0, 0, 0])
print(arr1[0, 0, 1])
print(arr1[0, 0, 2])

print(arr1[0, 1, 0])
print(arr1[0, 1, 1])
print(arr1[0, 1, 2])

print(arr1[0, 2, 0])
print(arr1[0, 2, 1])
print(arr1[0, 2, 2])
##----------------##
print(arr1[1, 0, 0])
print(arr1[1, 0, 1])
print(arr1[1, 0, 2])

print(arr1[1, 1, 0])
print(arr1[1, 1, 1])
print(arr1[1, 1, 2])

print(arr1[1, 2, 0])
print(arr1[1, 2, 1])
print(arr1[1, 2, 2])
##----------------##
print(arr1[2, 0, 0])
print(arr1[2, 0, 1])
print(arr1[2, 0, 2])

print(arr1[2, 1, 0])
print(arr1[2, 1, 1])
print(arr1[2, 1, 2])

print(arr1[2, 2, 0])
print(arr1[2, 2, 1])
print(arr1[2, 2, 2])




