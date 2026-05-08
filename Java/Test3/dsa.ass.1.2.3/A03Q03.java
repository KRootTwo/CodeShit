import java.util.Scanner;

class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException() {
        super("Marks > 100 not allowed");
    }
}

class Student {
    private final String name;
    private final float marks;

    Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class A03Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        float m = sc.nextFloat();

        try {
            if (m > 100)
                throw new MarksOutOfBoundException();

            Student s = new Student(name, m);
            System.out.println("Student added");

        } catch (MarksOutOfBoundException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}