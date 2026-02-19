class Student {
    private final String name;
    private final String reg;
    private final int marks;
    Student(String name, String reg, int marks) {
        this.name = name;
        this.reg = reg;
        this.marks = marks;
    }
    public void show() {
        System.out.println(name);
        System.out.println(reg);
        System.out.println(marks);
        
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sristhi", "25E114T56", 10);
        s1.show();
        
        Student s2 = new Student("Yash","25E112S54", 5);
        s2.show();

    }
}
