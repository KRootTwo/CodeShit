import java.io.*;
import java.util.Scanner;

public class Car {
	private final int year; 
	private final Color color;
	private final String name;
	private final String model;
	private final float maxSpeed;
	private String engine;
	private float currentFuel;
	private boolean isRunnin = false;
	private boolean isDrivable = true;
	
	public enum Color {
		White, Arctic_Grey, Pyro_Red, Black, Guards_Red, 
		Racing_Yellow, Shark_Blue, Python_Green, Lava_Orange,
		Ice_Gray_Metallic, GT_Silver_Metallic 
	}
	
	Car(String name, String model, String engine, int year, 
		Color color, float maxSpeed) {
		this.name = name;
		this.model = model;
		this.engine = engine;
		this.year = year;
		this.color = color;
		this.maxSpeed = maxSpeed;
		loadFuel();
	}
	public void showDs() {
		System.out.println("Name: " + name);
		System.out.println("Model: " + model);
		System.out.println("Engine: : " + engine);
		System.out.println("Year: " + year);
		System.out.println("Color: " + color);
		System.out.println("Max Speed: " + (int) maxSpeed + " Km/h");
		System.out.println("isDrivable: " + isDrivable);
	}
	public void addFuel(float n) {
		if (currentFuel < 90) {
			if (currentFuel + n < 90) {
				currentFuel += n;
			}
			else {
				currentFuel = 90;
				System.out.println("Tank Full.");
			}
		}
				saveFuel();
	}
    public void swapEngine(String s) {
        engine = s;
    }
	public void chkbrkdwn() {
		int x = (int) ((Math.random() * 9) + 1);
		if (x == 5) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println("Brrrr...voooshh. Think there's a breakdown mate.");
			isDrivable = false;
			isRunnin = false;
		}
	}
	public void saveFuel() {
		try {
            	try (FileWriter fw = new FileWriter("fuel.txt")) {
                    fw.write(String.valueOf(currentFuel));
                }
		} catch (IOException e) {
			System.out.println("Error saving file.");
		}
	}
	private void loadFuel() {
		try {
			File f = new File("fuel.txt");
			if (f.exists()) {
				try (Scanner blehh = new Scanner(f)) {
					currentFuel = Float.parseFloat(blehh.nextLine());
				}
			}
		} catch (IOException e) {
			System.out.println("Error loading fuel");
		}
	}
	public Car fix() {
		isDrivable = true;
		return this;
	}
	public Car start() {
		if (isDrivable) {
			if (currentFuel <= 0) System.out.println("No fuel, mate.");
			else if (currentFuel < 5) System.out.println("Low fuel. In reserved mode. Add fuel");
			else {
				System.out.println("Injecting fuel... Starting engine...");
				chkbrkdwn();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				if (isDrivable) {
					isRunnin = true;
					System.out.println("Car Started.");
				}
			}
		} else {
			System.out.println("Car is not drivable. Fix it first.");
		}
		return this;
	}
	public Car drive() {
		if (isRunnin) {
			System.out.println("Here we goooo...");
			animateCar();
			currentFuel -= 2;
		} else {
			if (!isDrivable) System.out.println("Car is broken.");
			else System.out.println("Start the car first.");
		}
		saveFuel();
		return this;
	}
	public void animateCar() {
		try {
			for (int pos = 0; pos < 40; pos++) {

				System.out.print("\033[H\033[2J");
				System.out.flush();

				String s = " ".repeat(pos);

				System.out.println(s + "   ______");
				System.out.println(s + "  /|_||_\\`.__");
				System.out.println(s + " (   _    _ _\\");
				System.out.println(s + "=`-(_)--(_)-'");

				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
		}

	}
}
