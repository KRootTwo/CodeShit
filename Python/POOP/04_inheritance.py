## Parent Class
class Animal:
    def __init__(self, name):
        self.name = name
        self.is_alive = True

    def eat(self):
        print(f"{self.name} is eating")

    def sleep(self):
        print(f"{self.name} is sleeping")

## Children Classes
class Dog(Animal):
    def speak(self):
        print("WOOF")

class Cat(Animal):
    def speak(self):
        print("MEOW")

class Mouse(Animal):
    def speak(self):
        print("SQUEEK")



dog = Dog("Scooby")
cat = Cat("Garfield")
mouse = Mouse("Mickey")

print(dog.name)
print(cat.name)
print(mouse.name)

dog.eat()
cat.sleep()

dog.speak()
cat.speak()
mouse.speak()





"""
INHERITANCE = Allows a class to inherit attributes and methods from
              from another class. Helps with code reusability and extensibility
              class Child(Parent)
"""