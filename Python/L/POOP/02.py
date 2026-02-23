class Employee :
    no_of_emp = 0
    apply_raise_amount = 1.00
    def __init__(self, first, last, pay) :
        self.first = first
        self.last = last
        self.pay = pay
        self.email = first + "." + last + "@hotmail.com"
        Employee.no_of_emp += 1

    def fullname(self) :
        return "{} {}".format(self.first, self.last)
    def apply_raise(self) :
        self.pay = int((self.pay * self.apply_raise_amount))
    def desc(self) :
        print(self.fullname())
        print(self.email)
        print(self.pay)

    @classmethod
    def set_raise_amt(cls, amt) :
        cls.apply_raise_amount = amt
    @classmethod
    def from_string(cls, strg) :
        first, last, pay = strg.split("-")
        return cls(first, last, int(pay))

Employee.set_raise_amt(1.06)

# emp_1 = Employee('Corey', 'Schafer', 50000)
# emp_2 = Employee('Test', 'Employee', 60000)

emp_1s = 'Corey-Schafer-50000'

emp_1 = Employee.from_string(emp_1s)
emp_1.apply_raise()

emp_1.desc()

