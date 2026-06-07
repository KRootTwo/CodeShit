import math

# Parameters
n = 50
p = 0.5


def binomial_prob(n, k, p):
    nCr = math.comb(n, k)
    return nCr * (p**k) * ((1 - p) ** (n - k))


# (a) Compute P(X=25)
p_25 = binomial_prob(n, 25, p)
print(f"(a) P(X=25) = {p_25:.6f}\n")

# (b) Print probabilities for k=20 to 30
print("(b) Probabilities for k from 20 to 30:")
for k in range(20, 31):
    print(f"  P(X={k}) = {binomial_prob(n, k, p):.6f}")

# (c) Verify that sum of all probabilities equals 1
total_sum = sum(binomial_prob(n, k, p) for k in range(n + 1))
print(f"\n(c) Sum of all probabilities from k=0 to 50 = {total_sum:.6f}")
