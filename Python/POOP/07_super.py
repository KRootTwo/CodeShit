class Shape:
    def __init__(self, color, filled):
        self.color = color 
        self.filled = filled
        
class Circle(Shape):
    def __init__(self, color, filled, radius):
        super().__init__(color, filled)
        self.radius = radius

class Square(Shape):
    def __init__(self, color, filled, width):
        super().__init__(color, filled)
        self.width = width

class Triangle(Shape):
    def __init__(self, color, filled, width, height):
        super().__init__(color, filled)
        self.width = width
        self.height = height

c = Circle(color = "red", filled = True, radius = 4)

print(c.color)
print(c.filled)
print(c.radius)













"""
-----------------TOO MUCH WRITING----------------
class Circle:
    def __init__(self, color, filled, radius):
        self.color = color
        self.filled = filled
        self.radius = radius

class Square:
    def __init__(self, color, filled, width):
        self.color = color
        self.filled = filled
        self.width = width

class Triangle:
    def __init__(self, color, filled, width, height):
        self.color = color
        self.filled = filled
        self.width = width
        self.height = height
"""

"""
super() = Functions used in a child class to call methods from a parent 
        class (Superclass)
        Allows u to extend the functionality of the inherited methods
"""