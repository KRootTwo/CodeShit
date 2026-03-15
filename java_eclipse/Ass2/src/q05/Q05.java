package q05;

class Square extends Shape {
	double side;
	Square(double side) {
		this.side = side;
	}
	double area() {
		return side * side;
	}
}
class Triangle extends Shape {
	double base;
	double height;
	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	double area() {
		return 0.5 * base * height;
	}
}
class Circle extends Shape {
	double radius;
	Circle(double radius) {
		this.radius = radius;
	}
	double area() {
		return Math.PI * radius * radius;
	}
}
class Q05 {
	public static void main (String [] args) {
		Square s = new Square(9.8);
		Triangle t = new Triangle(6.7, 2.3);
		Circle c = new Circle(3.5);
		System.out.println("Area of Square: " + s.area());
		System.out.println("Area of Triangle: " + t.area());
		System.out.println("Area of Circle: " + c.area());
	}
}











