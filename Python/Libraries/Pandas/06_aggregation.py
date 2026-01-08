import pandas as pd
df = pd.read_csv("Gen1PokemonsData.csv")

"""
Aggregate functions = Reduces a set of values into a single summary value used to
                      summarize & analyze data often used with the groupby() function
"""

## Whole DataFrame
print(df.mean(numeric_only = True))
print(df.median(numeric_only = True))
print(df.mode(numeric_only = True))
print(df.std(numeric_only = True))
print(df.sum(numeric_only = True))
print(df.max(numeric_only = True))
print(df.min(numeric_only = True))
print(df.count())

## Single column
print(df["Height"].mean())
print(df["Height"].median())
print(df["Height"].mode())
print(df["Height"].std())
print(df["Height"].sum())
print(df["Height"].max())
print(df["Height"].min())
print(df["Height"].count())

group = df.groupby("Type1")

print(group["Height"].mean())
print(group["Height"].sum())
print(group["Height"].min())
print(group["Height"].max())
print(group["Height"].count())
