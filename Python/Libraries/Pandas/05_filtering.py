import pandas as pd
df = pd.read_csv("Gen1PokemonsData.csv")

## Filtering = Keeping the rows that match a condition

tall_pokes = df[df["Height"] >= 2]
heavy_pokes = df[df["Weight"] > 100]
legend_pokes = df[df["Legendary"] == True]
water_pokes = df[(df["Type1"] == "Water") | (df["Type2"] == "Water")]
fireORfly_pokes = df[(df["Type1"] == "Fire") | (df["Type2"] == "Fire") | (df["Type1"] == "Flying") | (df["Type2"] == "Flying")]
fireANDfly_pokes = df[((df["Type1"] == "Fire") | (df["Type2"] == "Fire")) & ((df["Type1"] == "Flying") | (df["Type2"] == "Flying"))]


print(fireANDfly_pokes)

