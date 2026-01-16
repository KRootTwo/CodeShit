import pandas as pd 

print (pd.__version__)

"""
Series = A Pandas 1-dimensional labeled array that can 
hold any data type. Think of it like a single column in a 
spredsheet (1-dimensional)
"""

## With Listssss

data = [100, 201, 303]

ser = pd.Series(data, index = ["a", "b", "c"])

print(ser)

ser.loc["c"] = 300 ## Locate

print(ser.loc["b"])
print(ser.iloc[0]) ## Integer Location

print(ser[ser > 200])

## With Dictionariessss

calories = {"Day 1": 1750, "Day 2": 2100, "Day 3": 1700}

series = pd.Series(calories)

print(series)
print(series.loc["Day 1"])
print(series.iloc[2])
series.loc["Day 3"] += 500
print(series.loc["Day 3"])

print(series[series <= 2000])
