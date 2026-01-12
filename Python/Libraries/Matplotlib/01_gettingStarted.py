import matplotlib.pyplot as plt 
import numpy as np 

x = np.array([2023, 2024, 2025, 2026])
y1 = np.array([15, 25, 30, 20])
y2 = np.array([17, 23, 38, 5])

plt.plot(x, y1, marker = ".",
               markersize = 20,
               markerfacecolor = "#1cd3fc",
               markeredgecolor = "red",
               linestyle = "dashed",
               linewidth = 4,
               color = "red")

plt.plot(x, y2, marker = ".",
               ms = 20,
               mfc = "red",
               mec = "blue",
               ls = "dotted",
               lw = 4,
               color = "blue")

plt.show()



"""
plt.plot(x, y, marker = "./*/o/v", 
               markersize = 20,                            #short name - ms
               markerfacecolor = "#1cd3fc/cyan",           #short name - mfc
               markeredgecolor = "red",                    #short name - mec
               linestyle = "solid/dashed/dotted/           #short name - ls
                            dashdot/none,
               linewidth = ")
"""