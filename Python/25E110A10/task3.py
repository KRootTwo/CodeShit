# Task 3: Discount and Recommendations

units = float(input("Enter units consumed: "))

# Bill calculation
if units <= 100:
    total = 0
elif units <= 200:
    total = (units - 100) * 5
else:
    total = (100 * 5) + (units - 200) * 10

# Discount calculation
if units > 200:
    discount = total * 0.10
else:
    discount = 0

final_bill = total - discount

print(f"Original Bill: Rs. {total}")
print(f"Discount Applied: Rs. {discount}")
print(f"Final Bill after Discount: Rs. {final_bill}")

# Recommendations
print("\nEnergy Saving Recommendations:")
if units <= 150:
    print("> Great job! Keep using energy-efficient appliances.")
elif units <= 200:
    print("> Replace incandescent bulbs with LEDs.")
    print("> Use smart plugs or timers to save electricity.")
else:
    print("> Schedule an energy audit.")
    print("> Shift high-power usage to off-peak hours.")
