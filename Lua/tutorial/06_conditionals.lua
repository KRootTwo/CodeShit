print("Entre age: ")
local age = io.read("*n")

if age > 18 then
    print("Go fuck yourself nigger")
elseif age == 18 then
    print("fuck nigga")
else 
    print("Nah u can't fuck")
end



while age > 18 do
    print("shite")
    age = age - 1
end


















--[[
    Specific Input FormatsYou can pass arguments to io.read() to change what it captures:

    io.read("*n"): Reads a number. It automatically skips spaces and returns the value as a number type rather than a string.
    
    io.read("*l"): Reads the next line (default behavior).
    
    io.read("*a"): Reads the entire remaining input from the source.
    
    io.read(number): Reads a specific number of characters.
    
    Important ConsiderationsNumbers vs. Strings: Because standard input returns strings, you must use the tonumber() function if you plan to do math with a value captured via io.read() (unless you used the "*n" flag).Non-blocking Input: Standard Lua io.read() is "blocking," meaning the program stops and waits until the user presses Enter. For advanced uses like game development, you might need environment-specific libraries (e.g., UserInputService for Roblox) to handle real-time key presses.Prompts: Unlike Python's input("prompt"), Lua's io.read() does not accept a prompt string. You should use print() or io.write() immediately before calling it to tell the user what to enter
]]