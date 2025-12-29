## ASSIGNMENT 3 – ALL PROGRAMS (VARIABLE NAMES SHORTENED, QUESTIONS COMMENTED)

------------------------------------------------------------
## 1. Print all even numbers in user‑defined range
------------------------------------------------------------
# Q1: Even numbers in a range
s = int(input("Start: "))
e = int(input("End: "))
for n in range(s, e+1):
    if n % 2 == 0:
        print(n, end=" ")

## ------------------------------------------------------------
## 2. Fibonacci series up to n
## ------------------------------------------------------------
# Q2: Fibonacci up to n
n = int(input("n: "))
a, b = 0, 1
while a <= n:
    print(a, end=" ")
    a, b = b, a+b

## ------------------------------------------------------------
## 3. Sum of digits using while
## ------------------------------------------------------------
# Q3: Sum of digits
x = int(input("Enter number: "))
y = abs(x)
s = 0
while y > 0:
    s += y % 10
    y //= 10
print("Sum:", s)

## ------------------------------------------------------------
## 4. Convert while loop to for loop
## ------------------------------------------------------------
# Q4: Converted loop
for i in range(10, 0, -2):
    print(i)

## ------------------------------------------------------------
## 5. First number >100 divisible by 17
## ------------------------------------------------------------
# Q5: Divisible by 17
n = 101
while True:
    if n % 17 == 0:
        print("Ans:", n)
        break
    n += 1

## ------------------------------------------------------------
## 6. Output + continue explanation
## ------------------------------------------------------------
# Q6: Continue example
for i in range(10):
    if i % 3 == 0:
        continue
    print(i, end=" ")

# Output: 1 2 4 5 7 8

## ------------------------------------------------------------
## 7. Number pyramid pattern
## ------------------------------------------------------------
# Q7: Pyramid
n = 5
for i in range(1, n+1):
    print(" "*(n-i), end="")
    for j in range(1, i+1):
        print(j, end="")
    for j in range(i-1, 0, -1):
        print(j, end="")
    print()

##------------------------------------------------------------
##8. Butterfly pattern
##------------------------------------------------------------
# Q8: Butterfly
n = 5
for i in range(1, n+1):
    print("*"*i + " "*(2*(n-i)) + "*"*i)
for i in range(n, 0, -1):
    print("*"*i + " "*(2*(n-i)) + "*"*i)

##------------------------------------------------------------
##9. Pascal triangle
##------------------------------------------------------------
# Q9: Pascal
n = 5
for i in range(n):
    v = 1
    for j in range(i+1):
        print(v, end=" ")
        v = v * (i-j) // (j+1)
    print()

##------------------------------------------------------------
##10. 1, -2, 3, -4 ... series
##------------------------------------------------------------
# Q10: Alternating sign series
n = int(input("n: "))
for i in range(1, n+1):
    t = i if i % 2 else -i
    print(t, end="," if i < n else "
")

##------------------------------------------------------------
##11. sin(x) using series
##------------------------------------------------------------
# Q11: Taylor series sin(x)
import math
x = float(input("x radians: "))
n = int(input("terms: "))
sx = 0
for i in range(n):
    t = ((-1)**i) * (x**(2*i+1)) / math.factorial(2*i+1)
    sx += t
print("sin(x) =", sx)

##------------------------------------------------------------
##12. Nested loops output
##------------------------------------------------------------
# Q12: Output prediction
for i in range(1, 4):
    for j in range(i):
        print(i+j, end=" ")
    print()

# Output:
# 1
# 2 3
# 3 4 5

##------------------------------------------------------------
##13. First missing number
##------------------------------------------------------------
# Q13: Missing number
a = [1,2,3,5]
for i in range(1, len(a)+2):
    if i not in a:
        print("Missing =", i)
        break

##------------------------------------------------------------
##14. Fix the factorial program
##------------------------------------------------------------
# Q14: Corrected factorial
n = 5
f = 1
for i in range(1, n+1):
    f *= i
print("Factorial =", f)

##------------------------------------------------------------
##15. Student marks program
##------------------------------------------------------------
# Q15: Corrected student program
ns = int(input("Students: "))
tot = 0
for _ in range(ns):
    nm = input("Name: ")
    mk = float(input("Marks: "))
    if mk > 50:
        print(nm, "Passed")
    else:
        print(nm, "Failed")
    tot += mk
avg = tot / ns
print("Average =", avg)

##------------------------------------------------------------
##16. Prime check
##------------------------------------------------------------
# Q16: is_prime
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

x = int(input("Enter number: "))
print("Prime" if is_prime(x) else "Not prime")

##------------------------------------------------------------
##17. GCD
##------------------------------------------------------------
# Q17: gcd
def gcd(a, b):
    a, b = abs(a), abs(b)
    while b:
        a, b = b, a % b
    return a

print(gcd(48, 18))

------------------------------------------------------------
18. Palindrome
------------------------------------------------------------
# Q18: is_palindrome
def is_pal(s):
    s = str(s)
    return s == s[::-1]

print(is_pal(121))
print(is_pal("madam"))
print(is_pal("hello"))

------------------------------------------------------------
19. Count vowels & consonants
------------------------------------------------------------
# Q19: count_vc
def count_vc(s):
    vs = "aeiouAEIOU"
    v = c = 0
    for ch in s:
        if ch.isalpha():
            if ch in vs:
                v += 1
            else:
                c += 1
    return v, c

t = input("Text: ")
v, c = count_vc(t)
print("Vowels:", v)
print("Consonants:", c)

------------------------------------------------------------
20. Perfect number
------------------------------------------------------------
# Q20: is_perfect
def is_perfect(n):
    if n <= 1:
        return False
    s = 1
    i = 2
    while i*i <= n:
        if n % i == 0:
            s += i
            if i != n//i:
                s += n//i
        i += 1
    return s == n

print(is_perfect(6))
print(is_perfect(28))

------------------------------------------------------------
21. Anagram test
------------------------------------------------------------
# Q21: anagram
def is_ana(a, b):
    a, b = a.lower(), b.lower()
    if len(a) != len(b):
        return False
    for ch in a:
        if a.count(ch) != b.count(ch):
            return False
    return True

w1 = input("Word1: ")
w2 = input("Word2: ")
print("Anagram" if is_ana(w1, w2) else "Not anagram")

------------------------------------------------------------
22. Digital root
------------------------------------------------------------
# Q22: digital_root
def droot(n):
    while n >= 10:
        s = 0
        x = n
        while x > 0:
            s += x % 10
            x //= 10
        n = s
    return n

x = int(input("Number: "))
print("Digital Root:", droot(x))

------------------------------------------------------------
23. Longest word in sentence
------------------------------------------------------------
# Q23: longest word
s = input("Sentence: ")
w = s.split()
lg = w[0]
for x in w:
    if len(x) > len(lg):
        lg = x
print("Longest:", lg)
print("Length:", len(lg))

------------------------------------------------------------
24. Number guessing game
------------------------------------------------------------
# Q24: Guessing game
import random
n = random.randint(1, 100)
for k in range(5):
    g = int(input("Guess (-1 quit): "))
    if g == -1:
        print("Quit!")
        break
    if g == n:
        print("Win!")
        break
    elif g < n:
        print("Too low!")
    else:
        print("Too high!")
else:
    print("You lose! Number was", n)

------------------------------------------------------------
25. Pizza order system
------------------------------------------------------------
# Q25: Pizza program
t = 0
sz = input("Size S/M/L: ").upper()
if sz == "S":
    t += 150
elif sz == "M":
    t += 200
elif sz == "L":
    t += 250
else:
    print("Invalid -> default M")
    t += 200

if input("Extra sauce y/n: ").lower() == "y":
    t += 30
if input("Extra cheese y/n: ").lower() == "y":
    t += 40
if input("Drink y/n: ").lower() == "y":
    t += 50
if input("Dessert y/n: ").lower() == "y":
    t += 60

print("Total =", t)
print("Suggestions:")
print("1. Add menu display")
print("2. Use GUI/web interface")
