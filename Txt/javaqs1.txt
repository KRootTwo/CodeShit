class A {
    int x = 10;
    static int y = 200;
    A () {
        x++; y++;
    }
    A (int x, int y) {
        this.x = x;
        this.y = y;
    }
    void show() {
        System.out.println(x + " " + y);
    }
}

public class T3 {
    public static void main(String[] args) {
        int x = 1000, y = 2000;
        A obj1 = new A();
        A obj2 = new A(100, 200);
        A obj3 = new A(1, 2);

        obj1.x += 20;
        obj1.y += 20;
        obj1.show();

        obj2.x += 30;
        obj2.y += 30;
        obj2.show();

        obj3.x += 40;
        obj3.y += 40;
        System.out.println(x + " " + y);
    }
}
