-- intialization
local a = {}
-- key-value pair input
a["a"] = 1

-- Accessing
print(a.a)
print(a["a"])
print(a[0])

print()

local b = {name = "Dos", prof = "Termux", disp = 1080}

for key, value in pairs(b) do
    print(key .. " -> " .. value)
end
















--[[
    Main feature of this language. works kinda similar to python 
    dictionaries but on steroids.

    1. Empty table: 

        myTable = {}

    2. Table with key-value pairs:

        myTable = {key1 = value1, key2 = value2}

    3. Table with indexed values:

        myArray = {"element1", "element2", "element3"}


]]