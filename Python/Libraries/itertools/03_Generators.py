# Easier than making classes everytime
def MyRange (start, end) :
    current = start
    while (current < end) :
        yield current
        current += 1

nums = MyRange (1, 10) 

for num in nums :
    print (num)