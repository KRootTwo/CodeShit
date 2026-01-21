import numpy as np 
import pandas as pd 
import matplotlib.pyplot as plt 
import os
import math

# 1 b
a1 = np .array([2, 23, 56, 76, 43, 78, 67, 45])

n = int(input("Enter Number: "))

for i in a1 :
    if n == i :
        print("Found")

# 1 c
for i in range (1, 21):
    if (i % 5 == 0):
        continue;
    else:
        print(i)

# 2 a
cap = {"Bangladesh" : "Dhaka",
       "Nepal" : "Kathmandu",
       "Bhutan" : "Thimpu",
       "Srilanka" : "Colombo",
       "Pakistan" : "Karachi"
}
c = input("Enter neighbouring country: ").title()
for i in cap.keys():
    if (c == i):
        print(cap.get(c))

cap.update({"India" : "Delhi"})

print(cap)

# 3 a
fruits = ["apple", "banana", "apple", "orange", "banana", "apple"]
d = {}
for i in fruits :
    c = fruits.count(i)
    d[i] = c

print(d)

# 3 c
n = int(input("Enter N: "))
n += 1
while True :
    if n % 7 == 0 :
        print(n)
        break
    else :
        n += 1

# 5 a
def prime(n) :
    if n <= 1 :
        return False
    for i in range(2, (int(math.sqrt(n)) + 1)) :
        if n % i == 0 :
            return False
    return True

def primo(n):
    if n <= 1 :
        return False
    for i in range (2, n) :
        if n % i == 0 :
            return False
    return True

# 6 a
s = {1, 2, 3, 4, 5, 6, 7, 8}
s1 = {1, 2, 3}

print(s1.issubset(s))
print(s.issuperset(s1))

# 5 c
st = "Siuuuuuu123"
st2 = ""
st3 = "".join(i for i in st if not i.isdigit())

for i in st :
    if i.isdigit() :
        continue
    else :
        st2 += i

print(st3)

# 6 b
l = [1, 2, 3, 4, 4, 3, 2, 1]
l = set(l)
l = list(l)

def elmdup(l) :
    l1 = []
    for i in l :
        if i not in l1 :
            l1.append(i)
    return l1

def advelmd(l) :
    return list(dict.fromkeys(l))
## creates a dictionary from keys only {"key" : None, ...}
## dict keys are unique & ordered >=python 3.7

print(advelmd(l))

# 6 c


# 6 b
l = [1, 2, 3, 4, 5, 6, 7, 8, 9]
l2 = [2, 4, 6, 8]
l3 = []

for i in l :
    if i not in l2 :
        l3.append(i)

print(l3)

# 7 a
l = ["blehh", "bruh", "siuuu", "bomboclat"]

def lrw(n) :
    lar = l[0]
    for i in l :
        if len(lar) < len(i) :
            lar = i
    return lar
    
print(lrw(l))

max_str = max(l, key=len)
print(max_str)

# 7 c
w = "supercalifragilisticexpialidocious"
ws = "Ktv"

def vowc(n) :
    n.lower()
    v = ['a', 'e', 'i', 'o', 'u']
    c = 0
    for i in n :
        if i in v :
            c += 1
    return c

def vowcc(n) :
    return sum(1 for i in n if i in 'aeiouAEIOU')

print(vowc(w))
print(vowcc(w))
print(vowc(ws))

# 8 b
def sumreq(n) :
    if n <= 0 :
        return 0
    return n + sumreq(n - 1)

# print(sumreq(5))
def sD(n) :
    n = abs(n)
    s = 0
    while n != 0 :
        s += n % 10
        n //= 10
    return s

def arm(m) :
    for i in range (10, m + 1) :
        n = i
        l = len(str(i))
        s = 0
        while n != 0 :
            s += (n % 10) ** l
            n //= 10
        if s == i :
            print(i)

arm(1000)



"""
.join() takes a sequence of strings (list, tuple, etc.) and joins them into one string with the string you call it on as a separator.

sep.join(iterable)

sep → what you want between the elements
iterable → any collection of strings (list, tuple, even a generator)

.join() = glue the pieces together
The string you call it on = the glue, the iterable = the pieces
"""