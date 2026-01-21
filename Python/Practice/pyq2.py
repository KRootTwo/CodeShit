import os

f = open("blehh.txt", "r")
g = open("/home/ktv/CodeShit/Txt/test.txt")
h = open("/home/ktv/CodeShit/Txt/test2.txt", "w")

# For Microslop using peasents (ignore this)
# i = open(r"C:\Users\KTV\CodeShit\Txt\test2.txt", "r")


print(f.read())
print(g.read())

g.seek(0)
f.seek(6)

print(f.read())
print(g.read())

print(h.readable())
h.write("siuu")
# print(h.read())
print(g.fileno())
print(f.fileno())
print(h.fileno())



"""
r  → must exist
w  → wipes
a  → adds
+  → read & write

| Mode | Read  | Write  | Truncate  | Pointer |
| ---- | ----  | -----  | --------  | ------- |
| r    | ✅    | ❌     | ❌        | start   |
| w    | ❌    | ✅     | ✅        | start   |
| a    | ❌    | ✅     | ❌        | end     |
| r+   | ✅    | ✅     | ❌        | start   |
| w+   | ✅    | ✅     | ✅        | start   |
| a+   | ✅    | ✅     | ❌        | end     |

"""