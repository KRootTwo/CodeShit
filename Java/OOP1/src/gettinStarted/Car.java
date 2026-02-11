import java.io.*;
import java.util.Scanner;

public class Car {
	private final String name;
	private final String model;
	private final int year; 
	private String engine;
	private final float maxSpeed;
	private boolean isDrivable;
	private final Color color;
	private float currentFuel;
	private boolean isRunnin = false;
	
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
		currentFuel += n;
		saveFuel();
	}
    public void swapEngine(String s) {
        engine = s;
    }
	public void chkbrkdwn() {
		int x = (int) ((Math.random() * 9) + 1);
		if (x == 5) {
			System.out.println("Brrrr...voooshh. Think there's a breakdown mate.");
			isDrivable = false;
			isRunnin = false;
		}
	}
	public void saveFuel() {
		try {
			FileWriter fw = new FileWriter("fuel.txt");
			fw.write(String.valueOf(currentFuel));
			fw.close();
		} catch (IOException e) {
			System.out.println("Error saving file.");
		}
	}
	public void loadFuel() {
		try {
			File f = new File("fuel.txt");
			if (f.exists()) {
				Scanner blehh = new Scanner(f);
				currentFuel = Float.parseFloat(blehh.nextLine());
				blehh.close();
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
		chkbrkdwn();
		}
		if (isDrivable) {
			if (currentFuel <= 0) System.out.println("No fuel, mate.");
			else if (currentFuel < 5) System.out.println("Low fuel. In reserved mode. Add fuel");
			else {
				System.out.println("Injecting fuel... Starting engine...");
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
			System.out.println("Enjoy the ride blud...");
			currentFuel -= 2;
		} else {
			System.out.println("Start the car first.");
		}
		saveFuel();
		return this;
	}
}

/**
 * 	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getEngine() {
		return engine;
	}
	public float getMaxSpeed() {
		return maxSpeed;
	}
	public boolean isisDrivable() {
		return isDrivable;
	}
	public Color getColor() {
		return color;
	}
 */