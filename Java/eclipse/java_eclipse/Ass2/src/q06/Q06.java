package q06;

class Vehicle {
    String model;
    int year;
    Vehicle (String model, int year) {
        this.model = model;
        this.year = year;
    }
}
class Car extends Vehicle {
    int carId;
    double carPrice;
    Car (String model, int year, int carId, double carPrice) {
        super(model, year);
        this.carId = carId;
        this.carPrice = carPrice;
    }
    void carDisplay () {
        System.out.println("Model: " + super.model);
        System.out.println("Year: " + super.year);
        System.out.println("Car ID: " + this.carId);
        System.out.printf("Car Price: %,.0f\n", carPrice);
    }
}
class Q05 {
    public static void main(String[] args) {
        Car c = new Car("Koenigsegg One:1", 2014, 2, 10_000_000L);
        c.carDisplay();
    }
}