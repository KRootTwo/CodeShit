import numpy as np

scores = np.array([91, 55, 100, 72, 82, 64, 51, 60])

## Comparison 

## Sbscript Opertaor
fails = scores[scores < 60]
print(fails, "\n")
scores[scores < 60] = 0
print(scores, "\n")
passes = scores[scores >= 60]
print(passes, "\n")