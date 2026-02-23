# 5. Find the first number > 100 divisible by 17 (hint: using while + break).

i = 101

while (i > 100) :
    c = i % 17 
    if c == 0 :
        break
    i += 1
print (i)
