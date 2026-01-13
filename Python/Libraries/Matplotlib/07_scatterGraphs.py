import matplotlib.pyplot as plt
import numpy as np

plt.style.use("dark_background")
fontS = dict(fontsize = 20,
             fontweight = "bold",
             family ="JetBrains Mono") 
fontB = dict(fontsize = 30,
             fontweight = "bold",
             family ="JetBrains Mono")

## Scatter Graph = Shows the relationship between two variables helps 
#                  helps to identify a corelation (+, -, none)
#                  Ex. Study Hours vs. test scores

x1 = np.array([0, 1, 1, 2, 3, 4, 5, 6, 7, 7, 8])             # hours studied
y1 = np.array([55, 60, 65, 62, 68, 70, 75, 78, 82, 85, 87])  # marks

x1 = np.array([0, 1, 1, 2, 3, 4, 5, 6, 7, 7, 8])             # hours studied
y1 = np.array([55, 60, 65, 62, 68, 70, 75, 78, 82, 85, 87])  # marks

plt.scatter(x1, y1, color = "cyan",
                  alpha = 0.5,
                  s = 200)

plt.title("Whores V Grades", **fontB, color = "White")
plt.xlabel("Hours", **fontS, color = "lightgrey")
plt.ylabel("Grades", **fontS, color = "lightgrey")

plt.show()