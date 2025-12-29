# 2. Write a Python program to print the Fibonacci series up to a given number, n.
# The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, typically starting with 0 and 1. The sequence begins as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.


n = int(input("Enter limit: "))
a = 0
b = 1

# print ( a, b, end= " ")

while a <= n :
    print (a,  end=" ")
    a = b
    b = a + b

##### 2

# n = int(input("Enter limit: "))
# a = 0
# b = 1
# print (a, b, end=" ")
# while True :
#     c = a + b
#     if c > n :
#         break
#     print (c, end=" ")
#     a = b
#     b = c