import pandas as pd 

"""
Dataframe = A tabular structure with rows & columns (2 Dimensional)
Similar to a excel spreadsheet
"""

data = {"Name": ["Spongebob", "Patrick", "Squiward"],
        "Age": [30, 35, 50]}

df = pd.DataFrame(data, index = ["Kick", "That", "Nigger"])

# print(df, "\n")

## Add a column 
df["job"] = ["Cock", "N/A", "Cashier"]

## Add a column
new_row = pd.DataFrame([{"Name": "Sandy", "Age": 28, "job": "Engineer"},
                        {"Name": "Eugene", "Age": 60, "job": "Manager" }], index = ["Bitch", "off the"])
df = pd.concat([df, new_row])
print(df)