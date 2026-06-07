import math
import matplotlib.pyplot as plt

n = 8
p = 0.2

def bino_prob (n, k, p) :
    return math.comb(n, k) * p ** k * (1 - p) ** (n - k) 

probs = []
 
for i in range (n + 1) :
    probs.append(bino_prob(n, i, p))

print("x\tp(x)")

for i in range (n + 1) :
    print(i,"        ", probs[i])

plt.bar(range(n + 1), probs)
plt.xlabel("Errors")
plt.ylabel("prob")
plt.show()