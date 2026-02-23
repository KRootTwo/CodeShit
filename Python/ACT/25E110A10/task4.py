# Task 4: Comparison Between Two Users

units_a = float(input("Enter units consumed by User A: "))
units_b = float(input("Enter units consumed by User B: "))

# Bill for User A
if units_a <= 100:
    total_a = 0
elif units_a <= 200:
    total_a = (units_a - 100) * 5
else:
    total_a = (100 * 5) + (units_a - 200) * 10

# Bill for User B
if units_b <= 100:
    total_b = 0
elif units_b <= 200:
    total_b = (units_b - 100) * 5
else:
    total_b = (100 * 5) + (units_b - 200) * 10

print("\n##### Comparison #####")
print(f"User A: Units = {units_a} Bill = Rs. {total_a}")
print(f"User B: Units = {units_b} Bill = Rs. {total_b}")

if total_a > total_b:
    diff = ((total_a - total_b) / total_b) * 100 if total_b != 0 else 0
    print("User A pays more by", round(diff, 2), "%")
elif total_b > total_a:
    diff = ((total_b - total_a) / total_a) * 100 if total_a != 0 else 0
    print("User B pays more by", round(diff, 2), "%")
else:
    print("Both users have equal bills.")
