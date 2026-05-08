
/*
Define a base class Employee with the following instance variables: name, salary
The Employee class should have:
• A constructor to initialize name and salary.
• A method displayEmployeeInfo() to display the details of the employee (i.e., name and salary).
Define a derived class Manager that extends the Employee class and adds an additional instance variable
department (a String representing the department the manager manages).
The Manager class should:
• Have a constructor that uses the super keyword to call the Employee class's constructor to initialize
name and salary.
• Include a department field, which should be initialized in the constructor.
• Implement a method displayManagerDetails() that calls the displayEmployeeInfo() method from the
Employee class (using super) to display the employee's information and also displays the department
of the manager.
Write a program to:
1. Create an object of Manager and initialize its name, salary, and department.
2. Call the displayManagerDetails() method to display the details of the manager.
*/
class Employee {
    String name;
    float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayEmployeeInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}
class Manager extends Employee {
    String department;

    public Manager(String name, float salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        super.displayEmployeeInfo();
        System.out.println("Dep: " + this.department);
    }
    
}
public class A01Q09 {
    public static void main(String[] args) {
        Manager m = new Manager("Mr. Penis", 999.99f, "fertilizer");
        m.displayManagerDetails();
    }
}

