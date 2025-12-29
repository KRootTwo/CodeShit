# Write a Python program that:

# Takes a number n as input.

# Prints all even numbers up to n.

# For each even number, also prints whether it’s prime or not

n = int ( input ("Enter limit: "))
i = 0


while i <= n :

    d = 0
    for j in range (1, i) :
        if i % j == 0:
            d += 1
    if d <= 2 :
        print (i)
    i += 1

