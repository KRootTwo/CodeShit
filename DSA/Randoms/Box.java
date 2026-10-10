public class Box <T> {

    private T data;

    public Box(T obj) {
        this.data = obj;
    }
    public Box() {
        this.data = null;
    }

    public void insert(T obj) {
        this.data = obj;
    }

    public void open() {
        System.out.println(this.data);
    }
    
}