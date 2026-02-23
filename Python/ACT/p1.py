# Write a Python program to print all even numbers in a user-defined range.

n = int(input("Enter the range(0-n): "))
i = -1

while (i <= n) :
    if (i % 2 == 0) :
        print (i)
    i += 1

for i in range (0, n+1) :
    if (i % 2 == 0) :
        print (i)