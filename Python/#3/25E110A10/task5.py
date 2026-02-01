# Task 5: Optional - Advanced Features

units = float(input("Enter total units consumed: "))
season = input("Enter season (summer/winter/normal): ").lower()
peak_units = float(input("Enter number of peak-hour units: "))

# Seasonal pricing
if season == "summer":
    factor = 1.15
elif season == "winter":
    factor = 0.95
else:
    factor = 1.0

if units <= 100:
    base = 0
elif units <= 200:
    base = (units - 100) * 5
else:
    base = (100 * 5) + (units - 200) * 10

seasonal_bill = base * factor

# Peak/off-peak pricing example
offpeak_units = units - peak_units
peak_cost = peak_units * 12
offpeak_cost = offpeak_units * 7
peak_total = peak_cost + offpeak_cost

print(f"\nSeasonal Adjusted Bill: Rs. {seasonal_bill}")
print(f"Peak/Off-peak Bill Example: Rs. {peak_total}")

# Simple forecast
print("\nEnter last 3 months' consumption values:")
m1 = float(input("Month 1: "))
m2 = float(input("Month 2: "))
m3 = float(input("Month 3: "))
forecast = (m1 + m2 + m3) / 3
print(f"Predicted next month usage: {forecast} units")
