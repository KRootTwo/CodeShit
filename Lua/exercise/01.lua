-- 1
local fruits = {"apple", "banana", "mango", "orange"}

print(fruits[1], fruits[4])

-- 2
local nums1 = {10,20,30,40}

nums1[2] = 200
nums1[4] = 400

for i, j in pairs(nums1) do
    print(j)
end

-- 3
local player1 = {
    name = "KTV",
    hp = 100,
    mana = 50
}

print(player1.name)
print(player1.hp)

-- 4
player1["level"] = 50
player1["class"] = "god"

-- 5
player1.mana = nil

-- 6
for index, value in ipairs(fruits) do
    print(index, value)
end

-- 7
for i, j in pairs(player1) do
    print(i .. " -> " .. j)
end

-- 8
local nums2 = {4,7,2,9,1}

local function sumt(t)
    local s = 0
    for i, j in ipairs(t) do
        s = s + j
    end
    return s
end

print(sumt(nums2))

-- 9
local largest_num = math.mininteger

for i, num in ipairs(nums2) do
    if largest_num < num then
        largest_num = num
    end
end

print(largest_num)

-- 10
local nums3 = {2,7,8,11,14,21}

local function even_count(t)
    local cnt = 0
    for i, j in ipairs(t) do
        if j % 2 == 0 then
            cnt = cnt + 1
        end
    end
    return cnt
end

print(even_count(nums3))

-- 11
local player2 = {
    "sword",
    "shield",
    hp = 100,
    gold = 250
}

print(player2[1])
print(player2.hp)

-- 12
local player3 = {
    inventory = {"potion", "axe"},
    stats = {
        hp = 100,
        mana = 40
    }
}

print(player3.inventory[1])
print(player3.stats.mana)

-- 13
local players1 = {
    {name="A", hp=100},
    {name="B", hp=80},
    {name="C", hp=120}
}

for name, hp in pairs(players1) do
    print(name)
end

-- 14
local weakest_player = players1[1]

print(weakest_player.name, weakest_player.hp)

for i, player in ipairs(players1) do
    if player.hp < weakest_player.hp then
        weakest_player = player
    end
end

print(weakest_player.name, weakest_player.hp)

-- 15
local e = {}

table.insert(e, {name = "grass_block", count = "64"})
table.insert(e, 2, {name = "katana", count = 1})

-- 16
local player = {
    hp = 100,
    attack = function ()
        return math.random(10, 20)
    end,
    heal = function ()
        return math.random(20, 40)
    end
}

print(player.attack())
print(player.heal())

-- 17
local counter = {
    value = 0,

    increment = function (self)
        self.value = self.value + 1
    end,

    decrement = function (self)
        self.value = self.value - 1
    end
}

print(counter.value)
counter:increment()
print(counter.value)

counter.decrement(counter)
print(counter.value)

-- 18
local function createEnemy(name, hp)
    return {name = name, hp = hp}
end

local orc = createEnemy("Orc", 200)

print(orc.name, orc.hp)

-- 19

local enemies = {
    createEnemy("Godzilla", 90),
    createEnemy("He Hulk", 60),
    createEnemy("Big Brother", 100),
    createEnemy("Old sensei", 50),
    createEnemy("Kylian Mbappé", 80)
}


for i, tb in ipairs(enemies) do
    print(tb.name .. " -> " .. tb.hp)
end

-- 20
local function combat(player, enemies)
    while #enemies ~= 0 do
        for i, enemy in ipairs(enemies) do
            while enemy.hp > 0 do
                if player.hp <= 20 then
                    while player.hp < 30 do
                        player.hp = player.hp + player.heal()
                    end
                elseif player.hp < 0 then
                    break
                end
                print(enemy.name .. " V/S " .. "Player")
                print(enemy.hp .. " V/S " .. player.hp)

                print("*player attacks*")
                local dmgp = player.attack()
                print("Damage dealt: " .. dmgp)
                enemy.hp = enemy.hp - dmgp

                local dmg = math.random(20, 50)
                print("*" .. enemy.name .. " attacks*")
                print("Damage dealt: " .. dmg)
                player.hp = player.hp - dmg
            end
            table.remove(enemies, 1)
            print()
        end
    end
end

print()
combat(player, enemies)











