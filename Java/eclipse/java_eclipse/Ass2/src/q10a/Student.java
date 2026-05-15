package q10a;

public class Student extends Test{
	String name;
	long roll;
	void inputDetails(String name, long roll, float mark1, float mark2) {
		super.mark1 = mark1;
		super.mark2 = mark2;
		this.name = name;
		this.roll = roll;
	}
	void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.println("Marks 1: " + super.mark1);
		System.out.println("Marks 1: " + super.mark2);
	}
}
