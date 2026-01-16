import numpy as np 

## Filtering - Refers to the process of selecting elements from an
##             array that match a given condition

ages = np.array ([
    [21, 17, 19, 20, 16, 30, 18, 65],
    [39, 22, 15, 99, 18, 19, 20, 21]
])

teens = ages[ages < 18]
adults = ages[(ages >= 18) & (ages < 60)]  ## cuz numpy written in C
twats = ages[(ages > 60) | (ages < 18)]
seniors = ages[ages > 60]
evens = ages[ages % 2 == 0]
odds = ages[ages % 2 != 0]

print(teens)
print(adults)
print(twats)
print(evens)
print(odds)

adultss = np.where((ages > 18) & (ages < 60), ages, np.nan)

"""
where(condition, array, no. to replace with(rest of elements))  
nan = not a number
"""
print(adultss)