# print ( " Hello World!!! " )
#
#
# u = [x*2 for x in range(10)]
# for i,v in enumerate(u):
#     print(i," is the shit ", v, end=",\n")
import math

# i = [x for x in range(10) if x%2 == 0]
# print(i)
#
# for x,y in zip(range(10),range(10)):
#     print(x,y, end=", ")
# print()
# for m,n in zip(u,i):
#     print(m,n, end=", ")

# a,b,c = [1,2,3]
# print(a,b,c)

# a, c, d, *b = [1,2,3,4,5,6,7,8,9,0]
# print(a,b)
#
# l = []
#
# l.append(a)
# l.append(b)
# l.append(c)
# l.append(d)
#
# print(l)


n = [2, 3, 2, 5, 3, 3, 7, 2, 5, 7, 5, 7, 8, 4, 6, 7, 9, 9, 0, 1, 2, 3, 4, 6, -1, -3, -2, -4, -5, -8, -9, -6, -7, -8, -5, -7]
l = sorted(n)
#print(l)
v = -99
d = {}
for i in l :
    count = 0
    if i != v:
        v = i
        for h in n :
            if h == v:
                count += 1
        print (i, "comes", count, "times")
        d[i] = count

print (d)
