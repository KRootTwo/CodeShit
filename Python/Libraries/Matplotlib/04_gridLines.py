import matplotlib.pyplot as plt
import numpy as np
plt.style.use("dark_background")

x = np.array([2023, 2024, 2025, 2026])
y = np.array([15, 25, 30, 20])

plt.plot(x, y)

## grid() =  Helps make plot easier to read by adding reference lines

plt.grid(axis = "both",
         color = "#757474",
         linestyle = "dotted",
         linewidth = 2,)

plt.show()




"""
plt.grid(axis = " | ")
                  V
                x, y, both


"""