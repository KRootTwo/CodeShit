local str = "supercalifragilisticexpialidocious"

-- Length
print(#str)
local l = #"Hola"
print(l)

print(string.len(str))

print(type(str), type(l), type(#str))

local u  = tostring(l)
print(u)

print("Hello \nmadafaka \vVertical Tab")

print(string.sub(str, 3, 100))
print(string.byte('a'))
print(string.rep("Fuck Nigga\n", 100))

print(string.format("pi - %.3f\nage - %i", math.pi, 20))

print(string.find(str, "frag"))

local begin, ending = string.find(str, "frag");

print("Begin: " .. begin .. " Ending: " .. ending)

print(string.gsub(str, 'i', '|'))