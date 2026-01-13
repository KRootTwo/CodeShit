import matplotlib.pyplot as plt
import numpy as np

## Pie Chart = Circular chart divided into slices to show percentage of the total.
##             Good for visualising distribution among categories

plt.style.use("dark_background")

font = dict(family = "JetBrains Mono",
            color = "White",
            fontweight = "bold",
            fontsize = 30)

categories = np.array(["Freshmen", "Sophomores", "Juniors", "Seniors"])
values = np.array([300, 250, 275, 220])
colors = np.array(["red", "yellow", "blue", "green"])

plt.pie(values, labels = categories,
                autopct = "%.2f%%",
                colors = colors,
                explode = [0, 0, 0, 0.1],
                shadow = True,
                startangle = 180)
            
plt.title("BroCode College", **font)

plt.show()