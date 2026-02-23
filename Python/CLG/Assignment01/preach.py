# What is all()?

# all() checks:

# “Are all values True?”

# ✅ Basic examples
# print(all([True, True, True]))   # True
# print(all([True, False, True]))  # False

# 👉 If even one False → result is False

# Compare with any()

# There’s also:

# any(x in B for x in A)

# 👉 Means:

# “Is at least ONE element in B?”

# Example
# A = {1, 5}
# B = {1, 2, 3, 4}

# any(x in B for x in A)  # True (because 1 is in B)

# Final intuition
# Function	Meaning
# all()	everything must pass
# any()	at least one passes