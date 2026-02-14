
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Car {
	private final String name;
	private final String model;
	private final int year; 
	private final String engine;
	private final float maxSpeed;
	private final Color color;
	private float currentFuel;
	private boolean isDrivable;
	private boolean isRunnin = false;


    Car(String name, String model, int year, String engine, float maxSpeed, Color color) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }
    public enum Color {
		White, Arctic_Grey, Pyro_Red, Black, Guards_Red, 
		Racing_Yellow, Shark_Blue, Python_Green, Lava_Orange,
		Ice_Gray_Metallic, GT_Silver_Metallic 
    }
    public void showDs () {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine: " + engine);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Color: " + color);
        loadFuel();
    }
    public void saveFuel() {
        try {
            FileWriter fw = new FileWriter("fule.txt");
            fw.write(String.valueOf(currentFuel));
            fw.close();
        } catch (IOException e) {
            System.out.println("Error.");
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
            System.out.println("Error.");
        }
    }
    public void addFuel(float n) {
        currentFuel += n;
        saveFuel();
    }
    
}
