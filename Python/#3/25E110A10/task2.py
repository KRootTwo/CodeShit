# Task 2: Bill Breakdown and Analytics

units = float(input("Enter units consumed: "))

if units > 0:
    slab1 = min(units, 100)
    slab2 = min(max(units - 100, 0), 100)
    slab3 = max(units - 200, 0)

    charge1 = slab1 * 0
    charge2 = slab2 * 5
    charge3 = slab3 * 10

    total = charge1 + charge2 + charge3

    print(" ##### Bill Breakdown ##### ")
    print(f"0–100 units : {slab1} units --> Rs.{charge1}")
    print(f"101–200 units: {slab2} units --> Rs.{charge2}")
    print(f">200 units  : {slab3} units --> Rs.{charge3}")
    print(f"Total Bill (before discount): Rs. {total}")

    if units <= 150:
        print("Category: LOW CONSUMPTION --> Eco-friendly user")
    elif units <= 200:
        print("Category: AVERAGE CONSUMPTION --> Moderate user")
    else:
        print("Category: HIGH CONSUMPTION --> Energy Efficiency Alert!")

else:
    print("Invalid input! Units cannot be negative.")
