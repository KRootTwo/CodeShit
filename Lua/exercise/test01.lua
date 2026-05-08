-- print(math.random(0, 10))

local a = {
    {name = "frog", hp = 20}
}

local b = {}

print(#a)
print(#b)

















--[[

local counter = {
  value = 0,
  increment = function(self)
    self.value = self.value + 1
  end
}

counter:increment()


local counter = {
  value = 0,
  increment = function(self)
    self.value = self.value + 1
  end
}

counter.increment(counter)



-- ]]