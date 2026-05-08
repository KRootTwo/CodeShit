local e = "22"
local f = "22a"

print(type(tonumber(e)))
print(type(tonumber(f)))

-- Math works similar to java or C

-- floor div
print(10 // 3)

print(math.pi)
print(math.maxinteger)

-- math.random works almost exactly like java 0 <= output <= 1

print(math.random())

print(os.time())
print(math.randomseed(os.time()))
print(math.random())

print(math.random(10, 50))  -- bruhh

