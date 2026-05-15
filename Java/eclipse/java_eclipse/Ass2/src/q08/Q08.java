package q08;

class Duck implements Flyable, Swimmable {
	String name;
	Duck(String name) {
		this.name = name;
	}
	@Override
	public void swim() {
		System.out.println(name + " is swimming dawg");
	}
	@Override
	public void fly() {
		System.out.println(name + " is flying dawg");		
	}
	void displayAbilities() {
		System.out.println("Name of duck: " + name);
		System.out.println("Abilities: Fly, Swim");
	}
}

public class Q08 {
	public static void main(String[] args) {
		Duck d = new Duck("Donald");
		d.displayAbilities();
		d.swim();
		d.fly();
	}
}
