public class Car {
	private final String name;
	private final String model;
	private final int year; 
	private String engine;
	private final float maxSpeed;
	private final boolean forSale;
	private final Color color; 
	
	public enum Color {
		White, Arctic_Grey, Pyro_Red, Black, Guards_Red, 
		Racing_Yellow, Shark_Blue, Python_Green, Lava_Orange,
		Ice_Gray_Metallic, GT_Silver_Metallic 
	}
	
	Car(String name, String model, String engine, int year, 
		Color color, float maxSpeed, boolean forSale) {
		this.name = name;
		this.model = model;
		this.engine = engine;
		this.year = year;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.forSale = forSale;
	}
	void showDs() {
		System.out.println("Name: " + name);
		System.out.println("Model: " + model);
		System.out.println("Engine: : " + engine);
		System.out.println("Year: " + year);
		System.out.println("Color: " + color);
		System.out.println("Max Speed: " + (int) maxSpeed + " Km/h");
		System.out.println("forSale: " + forSale);
	}
    public void swapEngine(String s) {
        engine = s;
    }
	public String getName() {
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
	public boolean isforSale() {
		return forSale;
	}
	public Color getColor() {
		return color;
	}
}
