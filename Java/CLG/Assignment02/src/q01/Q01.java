// 1. Define a class Person with two instance variables:
//  name and age
// and two member methods:
//  setData(): set the details of the person.
//  displayData(): display the details of the person.
// Now, create two objects of class person and initialize one object value directly (by
// using the dot(.) operator name: “Rohan” and age: 20 ). Accept your name and age
// through the keyboard and set them to another object using the setData() method.
// Now display both the member variables using the displayData() method. Also, check
// who is younger.
import java.util.Scanner;
class Person {
    String name;
    int age;
    public void setData(String n, int a) {
        name = n;
        age = a;
    }
    public void displayData() {
        System.out.println("Name - " + name);
        System.out.println("Age - " + age);
    }
}
class Q01 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setData("Rohan", 20);
        System.out.print("Enter first name & age: ");
        String f = blehh.next();
        int r = blehh.nextInt();
        p2.setData(f, r);
        p1.displayData();
        p2.displayData();
        if (r > 20) System.out.println("You are younger");
        else if (r < 20) System.out.println("Rohan is younger");
        else System.out.println("Both have same age");
    }
}