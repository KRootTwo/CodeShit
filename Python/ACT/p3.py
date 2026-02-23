# 3. Take an integer input and find the sum of its digits using a while loop.

d = int ( input ("Enter digit: "))
sum = 0

while d > 0 :
    x = d % 10 
    d = d // 10
    sum += x

print (sum)
    