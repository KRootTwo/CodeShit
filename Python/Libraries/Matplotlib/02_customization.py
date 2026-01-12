import matplotlib.pyplot as plt
import numpy as np
plt.style.use("dark_background")

x = np.array([2023, 2024, 2025, 2026])
y1 = np.array([15, 25, 30, 20])
y2 = np.array([17, 23, 38, 5])
y3 = np.array([13, 15, 20, 30])

line_syle = dict(marker = ".",
                  markersize = 20,
                  markerfacecolor = "purple",
                  markeredgecolor = "white",
                  linestyle = "solid",
                  linewidth = 4)


plt.plot(x, y1, color = "blue", **line_syle)
plt.plot(x, y2, color = "brown", **line_syle)
plt.plot(x, y3, color = "green", **line_syle)


plt.show()
               