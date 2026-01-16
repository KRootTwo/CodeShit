import pandas as pd 
daf = pd.read_csv("Gen1PokemonsData.csv", index_col = "Name")

pokemon = str(input("Enter name of de pokemon: ").capitalize())

if pokemon in daf.index:
    print("Let's go", pokemon, "!!")
    print(daf.loc[pokemon])
else :
    print("Nigga what!!")

try:
    print(daf.loc[pokemon])
except KeyError:
    print("Wth Aitah")


"""
if variable in dataframe["Name"].values:
    print("Found")
"""