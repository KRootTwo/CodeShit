import numpy as np  

arr = np.array([1, 2, 3])
arr2 = np.array([1.02, 2.50, 3.99])
radii = np.array([11, 21, 34])
print(arr, "\n")
print(arr2, "\n")
print(radii, "\n")

## Scalar Math Funcs
print(arr + 1, "\n")
print(arr - 2, "\n")
print(arr * 3, "\n")
print(arr / 4, "\n")
print(arr ** 5, "\n")
print(arr // 6, "\n")

## Vectorized Math Funcs
print(np.sqrt(arr), "\n")
print(np.add(arr, arr * 2), "\n")
print(np.square(arr), "\n")
print(np.round(arr), "\n")
print(np.floor(arr), "\n")
print(np.ceil(arr), "\n")
print(np.pi, "\n")
print(np.e, "\n")
print(np.pi * radii ** 2) # circumference

## Element-wise Arithmatic
print(arr + arr2, "\n")
print(arr - arr2, "\n")
print(arr * arr2, "\n")
print(arr / arr2, "\n")
print(arr ** arr2, "\n")
print(arr // arr2, "\n")

