import matplotlib.pyplot as plt
import numpy as np

# Bar Chart = compare catagories of data by representing each catagory with a bar

plt.style.use("dark_background")

catagories = np.array(["Grains", "Fruits", "Vegetables", "Protein", "Dairy", "Sweets"])
values = np.array([4, 3, 2, 5, 3, 1])

font = dict(family = "JetBrains Mono",
            fontweight = "bold",
            color = "lightgrey")

plt.bar(catagories, values, color = "lightblue")
# plt.barh(catagories, values, color = "lightblue")

plt.title("Daily Consumption", **font, fontsize = 30)
plt.xlabel("Food", **font, fontsize = 20)
plt.ylabel("Quantity", **font, fontsize = 20)


plt.show()
