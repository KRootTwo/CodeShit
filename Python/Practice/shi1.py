per=float(input("Enter the percentage:"))
grade="F"
if per>=90 :
    grade="AA"
elif per>=70 and per<90:
    grade="A"
elif per>=50 and per<70:
    grade="B"
elif per>=30:
    grade="C"
else:
    grade="F"
print("grade is:",grade)
