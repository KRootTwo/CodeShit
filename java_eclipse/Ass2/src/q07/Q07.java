package q07;

class Shape {
    String color;
    Shape(String color) {
        this.color = color;
    }
}
class Circle extends Shape {
    double radius;
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    void display() {
        System.out.println("Shape: Circle");
        System.out.println("Color: " + super.color);
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + area());
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    void display() {
        System.out.println("Shape: Rectangle");
        System.out.println("Color: " + super.color);
        System.out.printf("Length & Width: %f %f\n", length, width);
        System.out.println("Area: " + area());
    }
}
class Q07 {
    public static void main(String[] args) {
            Circle c = new Circle("Blue", 7.2);
            Rectangle r = new Rectangle("Red", 9.8, 6.7);
            c.display();
            r.display();
    }
}
