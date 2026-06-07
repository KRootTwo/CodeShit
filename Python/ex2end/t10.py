# import numpy as np

# x = np.array([1, 2, 3, 4, 5, 6])
# px = np.ones(6) / 6

# EX = np.sum(x * px)
# EX2 = np.sum((x**2) * px)

# var1 = np.sum(((x - EX)**2) * px)


import random

N = 100000

counts = {s: 0 for s in range(2, 13)}

for _ in range(N):
    d1 = random.randint(1, 6)
    d2 = random.randint(1, 6)
    counts[d1 + d2] += 1

print("Sum\tEmpirical\tTheoretical")

for s in range(2, 13):
    empirical = counts[s] / N

    ways = 0
    for d1 in range(1, 7):
        for d2 in range(1, 7):
            if d1 + d2 == s:
                ways += 1

    theoretical = ways / 36

    print(f"{s}\t{empirical:.4f}\t\t{theoretical:.4f}")