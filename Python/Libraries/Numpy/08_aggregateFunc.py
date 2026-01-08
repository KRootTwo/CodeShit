import numpy as np 

## AGGREGATE FUNCTIONS = summarize data & typically return a single value

array = np.array([[1, 2, 3, 4, 5], 
                  [6, 7, 8, 9, 10]])

###########################################

print(np.sum(array))  ## sum
print(np.std(array))  ## Standard deviation
print(np.mean(array)) ## mean
print(np.var(array))  ## variation

print(np.max(array))    ## index of max
print(np.min(array))    ## index of min

print(np.argmax(array)) ## index of max
print(np.argmin(array)) ## index of min

############################################

print(np.sum(array, axis = 0)) ## sum of all columns
print(np.sum(array, axis = 1)) ## sum of all rows
print(np.sum(array, axis = -1))
print(np.sum(array, axis = -2))


