# Task 1: Basic Billing Calculation

units = float(input("Enter units consumed: "))

if units <= 100 :
    bill = 0
elif units <= 200 :
    bill = (units - 100) * 5
else:
    bill = (100 * 5) + (units - 200) * 10

print(f"Total units consumed: {units}")
print(f"Basic Bill Amount: {bill}/-")
