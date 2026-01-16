import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import os

a = np.array([[1, 2, 3],[4, 5, 6]])
b = np.array([[[1, 2, 3], [0, -1, -2]],
              [[4, 5, 6], [0, -1, -2]],
              [[7, 8, 9], [0, -1, -2]]])

print(a.ndim)
print(b.ndim)
print(b.shape)
print(type(a))
print(a.dtype)
print(a.shape)
print(a.max())
print(a.min())
print(np.sum(a))
print(np.mean(a))
print(np.std(a))
print(np.var(a))
print(a.reshape(3, 2))
print(a.reshape(6, -1))
a = a[a % 2 == 0]
m = np.arange(0, 12).reshape(2, 3, 2)
print(m)
