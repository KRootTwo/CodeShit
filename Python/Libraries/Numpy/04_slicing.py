import numpy as np  

arr = np.array(
    [[ 1,  2,  3,  4],
     [ 5,  6,  7,  8],
     [ 9, 10, 11, 12],
     [13, 14, 15, 16]]
)

print(arr.shape)

## Same as string slicing array[start:stop:step]
## mind u stop is exclusive don't forget it like the last fucking time.
## Stupid bitch

print(arr[0:4] ,"\n")
print(arr[::] ,"\n")
print(arr[1:2] ,"\n")
print(arr[1:3] ,"\n")
print(arr[::2] ,"\n")
print(arr[::-1] ,"\n")
print(arr[::-2] ,"\n")
print(arr[::-3] ,"\n")
print(arr[::-4] ,"\n")
print(arr[::-5] ,"\n")
print(arr[::-10] ,"\n")

## array[row, column] for 2D arrays :, selects all

print(arr[:, :] ,"\n")
print(arr[:, 0] ,"\n")
print(arr[:, 1] ,"\n")
print(arr[:, 2] ,"\n")
print(arr[:, 3] ,"\n")
print(arr[:, -1] ,"\n")

print(arr[0, :] ,"\n")
print(arr[1, :] ,"\n")
print(arr[2, :] ,"\n")
print(arr[3, :] ,"\n")
print(arr[-1, :] ,"\n")

print(arr[:, :1], "\n")
print(arr[:, :2], "\n")
print(arr[:, :3], "\n")
print(arr[:, :4], "\n")

print(arr[0:2, 0:2], "\n")
print(arr[2:4, 1:4], "\n")
print(arr[-2:-4, -3:-5], "\n")


