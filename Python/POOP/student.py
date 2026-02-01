class Student:

    grad_year = 2025
    num_students = 0

    def __init__(self, name, age):
        self.name = name
        self.age = age
        Student.num_students += 1









"""
CLASS VARIABLES = Shared among all instances of a class.
                  Defined outside the constructor.
                  Allow you to share data among all objects created 
                  from that class.
"""