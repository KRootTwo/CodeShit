package carA;

import carA.Car.Color;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car("Porshe", "911 GT3 RS", 
				"NA I6", 2022, Color.Lava_Orange, 296, true);
		c1.showDs();
	}

}
