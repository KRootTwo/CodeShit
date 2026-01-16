import pandas as pd
df = pd.read_csv("Gen1PokemonsData.csv")

"""
Cleaning = The Process of fixing/removing:
           incomplete, incorrect, or irrelevent data
           ~75% of work done with pandas is data cleaning
"""

## Drop irrelevent columns
df = df.drop(columns = ["No"])

## Handle Missing data
#Drops all the rows with missing "Type2". na - not available
df = df.dropna(subset = ["Type2"])
df = df.fillna({"Type2" : "None"}) 

## Fix Inconsistent Values
df["Type1"] = df["Type1"].replace({"Fairy": "Magic"})

## Standardize text
df["Name"] = df["Name"].str.lower()

## Fix data types 
df["Legendary"] = df["Legendary"].astype(bool)

## Remove Duplicate Values
df = df.drop_duplicates()

print(df.to_string())