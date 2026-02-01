from student import Student as stud

s1 = stud("Spongebob", 30)
s2 = stud("Patrick", 35)
s3 = stud("Squidward", 55)
s4 = stud("Snady", 27)

print(f"My graduating class of {stud.grad_year} has {stud.num_students} students.")

print(s1.name)
print(s2.name)
print(s3.name)
print(s4.name)