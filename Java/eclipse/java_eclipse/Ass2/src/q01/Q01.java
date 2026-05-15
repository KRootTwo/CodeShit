package q01;
class Car {
    String model;
    int year;

    void setDetails(String model, int year) {
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println(this.model);
        System.out.println(this.year);
    }
}
class Q01 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.setDetails("Toyota", 2020);
        c2.setDetails("Hyundai", 2023);

        c1.displayDetails();
        c2.displayDetails();

    }
}