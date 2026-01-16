import pandas as pd

df = pd.read_csv("Gen1PokemonsData.csv", index_col = "Name")
df = pd.read_json("Gen1PokemonsData.json")

print(df.to_string()) ## to print the whole shit

# Selection by column
print(df["Name"].to_string())
print(df[["Name", "Height", "Weight"]].to_string())

# Selection by row
print(df.loc["Charizard":"Blastoise", ["Height","Weight"]])
print(df.iloc[0:11:2, 0:3])
##         rows--^     ^--column