class Jet:
    def __init__(self, name, company, generation, speed, types, country):
        self.name = name
        self.generation = generation
        self.company = company
        self.speed = speed
        self.types = types
        self.country = country

    def fly(self):
        print(f"You're flying a {self.generation}th gen {self.company} {self.name}. Capable of going upto Mach {self.speed}. Godspeed Soldier.")

class Fighter(Jet):
    pass

class Bomber(Jet):
    pass

class Striker(Jet):
    pass

class Multirole(Fighter, Bomber, Striker):
    pass