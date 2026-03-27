nums = [1, 2, 3]

# for num in nums :
#     print(num)

# print(dir(nums)) # if it has __iter__ method it's an iterable

i_nums = nums.__iter__()

# print (dir (i_nums))

# print (i_nums)

# print (i_nums.__next__()) # or 
# print (next(i_nums))
# print (next(i_nums))
# print (next(i_nums))


# This is what a for loops does in the background
while True :
    try :
        item = next(i_nums)
        print(item)
    except StopIteration :
        break


'''
    * Iterator is an object with a state that it remembers where 
    it is during iterations.
    * It also know how to get their next value (with __next__)
    * Iterables are also iterable
    * Can go on forever untill there is a next value


'''