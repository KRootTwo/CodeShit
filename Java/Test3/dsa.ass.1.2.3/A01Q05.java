/*
Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a java program to
display area of different shapes.
*/
abstract class Shape {
    abstract void area();
}
class Square extends Shape {
    int side;
    Square(int s) {
        this.side = s;
    }
    void area () {
        System.out.println("Area: " + side * side);
    }
}
public class A01Q05 {

}