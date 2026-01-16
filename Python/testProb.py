'''
output the sum of all integer elements in the given nested tuple
nested_tuple((1, True, -2), (4, ('A', -5.6)), ((7,), 'C'), 0, ('T', 3.5))
'''

nested_tuple = ((1, True, -2), (4, ('A', -5.6)), ((7,), 'C'), 0, ('T', 3.5))
sum = 0
tp = ()

for i in nested_tuple:
    if (type(i) != type(1)):
        s = i
        for j in s:
            if(type(j) == type(1)):
                sum += j
            elif (type(j) == type(tp)):
                t = j
                for k in t:
                    if (type(k) == type(1)):
                        sum += k

print ("Muhfucking sum: ", sum)