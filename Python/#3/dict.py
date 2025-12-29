## dictionaryy

country_codes = {"Finland": "fi", "South Africa": "za", "Nepal": "np"}

# country_codes.clear()

if country_codes:
    print("Dictionary is not empty.")
else:
    print("Dictionary is empty.")

##          key1  value1  key2   value2  key3  value3 key4  value4 key5 value5
moDays = {"January": 31, "February": 28, "March": 31, "April": 30, "May": 15}

# Print an item
print(moDays["May"])

# Edit an item
moDays["May"] = 31

# Add an item
moDays["June"] = 30

# Delete an item
del moDays["May"]

# Gets a value assigned to the key
# print ( moDays.get['June'] )

# Iterating through a dictionary
for MonthName, NumberofDays in moDays.items():
    print(MonthName, NumberofDays)

for MonthName in moDays.keys():
    print(MonthName, end=" ")

for MonthName in moDays.values():
    print(MonthName, end=" ")
