package two;

public class Car {
	int wheels;
	String color;
	float maxSpeed;
	float fuel;
	int seats;
	boolean drivable = false;
	int o;
	
	public void init(int wheels, String color, float maxSpeed,
			float fuel, int seats, boolean drivable) {
		wheels = this.wheels;
		o = this.wheels;
		color = this.color;
		maxSpeed = this.maxSpeed;
		fuel = this.fuel;
		seats = this.seats;
		if (this.drivable) drivable = true;
		updateCondition();
	}
	public void stats() {
		System.out.println("Wheels - "+ wheels);
		System.out.println("Color - "+ color);
		System.out.println("Max Speed - "+ maxSpeed +" kmph");
		System.out.println("NO. of Seats - "+ seats);
		System.out.println("Current Fuel - "+ fuel +" lt.");
		if (fuel > 0) System.out.println("Condition - "+ drivable);
		else System.out.println("Not Drivable. Need Fuel");
	}
    public void updateCondition() {
        if (wheels >= o && fuel > 0)
            drivable = true;
        else
            drivable = false;
    }
	public void refuel(float gas) {
		fuel += gas;
		updateCondition();
	}
	public void puncture(int w) {
		wheels -= w;
		drivable = false;
		updateCondition();
	}
	public void drive() {
		if (drivable) {
			System.out.println("Car is drivingg...");
			fuel--;			
		}
		else System.out.println("Car is not drivable.");
		updateCondition();
	}
	public void repair() {
		wheels = o;
		updateCondition();
	}
}