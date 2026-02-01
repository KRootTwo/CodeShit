from abc import ABC, abstractmethod

class Vehicle(ABC):


    @abstractmethod
    def go(self):
        pass

    @abstractmethod
    def stop(self):
        pass

class Car(Vehicle):
    def go(self):
        print("You drive de car.")

    def stop(self):
        print("You stop de car.")

class Motorcycle(Vehicle):
    def go(self):
        print("You ride de Motorcycle.")

    def stop(self):
        print("You stop de Motorcycle.")

class Boat(Vehicle):
    def go(self):
        print("You sail de boat.")

    def stop(self):
        print("You anchor de boat.")

## veh = Vehicle()
c = Car()
m = Motorcycle()
b = Boat()

b.go()









"""
ABSTRACT CLASS = A class that cannot be instantiated on it's own; Meant to be subclassed.
                 They contain abstract methods, which are declared but have no implementation.
                 Abstract classes benefits :
                    1. Prevents instantiation of the class itself
                    2. Requires children to use inherited abstract methods

Children classes should have the same number of methods found in parent method
"""