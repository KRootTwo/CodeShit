package q09;

class Employee {
	String name;
	float salary;
	Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	void displayEmployeeInfo() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}
class Manager extends Employee {
	String department;
	Manager(String name, float salary, String department) {
		super(name, salary);
		this.department = department;
	}
	void displayManagerDetails() {
		super.displayEmployeeInfo();
		System.out.println("Manager of Department: " + this.department);
	}
}

public class Q09 {
	public static void main (String [] args) {
		Manager m = new Manager("Sun Tzu", 98_000, "War");
		m.displayManagerDetails();
	}
	
}
