
public class Main {
    public static void main(String[] args) {
		Car c1 = new Car("Porshe", "911 GT3 RS", 
				"NA I6", 2022, Car.Color.Pyro_Red, 296);
        // c1.showDs();
        // c1.swapEngine("Turbo charged V-8");
        // c1.showDs();

        // c1.addFuel(67);
        // c1.fix();
        c1.start().drive();
    }
}

