import pandas as pd 

df = pd.read_csv("Gen1PokemonsData.csv", index_col = "Name")

# print(df.to_string())
# print(df[["Name", "Weight", "Height"]].to_string())

# print(df.loc["Bulbasaur" : "Blastoise", ["Weight", "Height"]])
# print(df.iloc[0:9:3, 0:3])

# p = input("Enter the name of Pokemon: ").capitalize()

# if p in df.index:
#     print("Let's go", p, "!!")
#     print(df.loc[p])
# else :
#     print("What The Fuck Aitah!!")

tall = df[df["Height"] >= 2]
short = df[df["Height"] < 2]
heavy = df[df["Weight"] > 100]
light = df[df["Weight"] <= 100]
wotah = df[(df["Type1"] == "Water") | (df["Type2"] == "Water")]

print(wotah)