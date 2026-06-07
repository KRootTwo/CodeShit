import numpy as np

freq = np.array([20, 35, 40, 45, 30, 30])
total = freq.sum()

pmf = freq / total

print("Empirical PMF:")

for i in range(1, len(freq)) :
    print(f"P({i}) = {pmf[i - 1]:.4}")


x = np.arange(1, 7)
print(x)

mean = np.sum(x * pmf)
variance = np.sum((x - mean)**2 * pmf)

print("\nEmpirical Mean =", mean)
print("Empirical Variance =", variance)


# for i, p in enumerate(pmf, start=1):
#     print(f"P({i}) = {p:.4f}")


