--[[

    nil
    number  1  1.24  0.1  44
    string 'hello'  "Blud"
    boolean  true  false
    table

]]

local a
print(a) 

a = 2
print(a) 

local name = "Dom"
print("Hello " .. name)

-- Possible
-- name = nil
-- print(name)
-- name = 20
-- print(name)
-- name = true
-- print(name)

local fn = "Cogobo"
local ln = "Prosto"

print(fn .. ln)
print(fn .. " " .. ln)

-- Multiline 

local name = [[
hello 
nigger
]]

print(name)