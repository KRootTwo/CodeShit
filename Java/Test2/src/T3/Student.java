public class Student {
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
