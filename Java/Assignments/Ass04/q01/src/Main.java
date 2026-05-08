
import java.util.Scanner;


class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    public Node (int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }

    
}


public class Main {

    static Node start = null;
    static Scanner blehh = new Scanner(System.in);

    public static void create(Node start) {
        System.out.print("How many nodes: ");
        int n = blehh.nextInt();

        Node tracker = Main.start;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter reg: ");
            int r = blehh.nextInt();
            System.out.print("Enter marks: ");
            float m = blehh.nextFloat();

            Node newNode = new Node(r, m);

            if (Main.start == null) {
                Main.start = newNode;
                tracker = newNode;
            }
            else {
                tracker.next = newNode;
                tracker = tracker.next;
            }
        }
    }
    public static void display(Node start) {
        Node tracker = Main.start;
        while (tracker != null) {
            System.out.println("Reg: " + tracker.regd_no);
            System.out.println("Marks: " + tracker.mark);
            System.out.println();
            tracker = tracker.next;
        }
    }
    public static Node InsBeg(Node start) {
        System.out.print("Enter reg: ");
        int r = blehh.nextInt();

        System.out.print("Enter marks: ");
        float m = blehh.nextFloat();

        Node newNode = new Node(r, m);

        if (start == null) {
            start = newNode;
        }
        else {
            newNode.next = start;
            start = newNode;
        }

        return start;
    }
    public static Node InsEnd(Node start) {
        System.out.print("Enter reg: ");
        int r = blehh.nextInt();

        System.out.print("Enter marks: ");
        float m = blehh.nextFloat();

        Node newNode = new Node(r, m);
        Node tracker = start;

        if (start == null) {
            start = newNode;
        }
        else {
            while (tracker.next != null) {
                tracker = tracker.next;
            }
            tracker.next = newNode;
        }

        return start;
    }
    public static Node InsAny(Node start) {

        System.out.print("Enter reg: ");
        int r = blehh.nextInt();
        System.out.print("Enter marks: ");
        float m = blehh.nextFloat();

        Node newNode = new Node(r, m);

        System.out.print("Which position: ");
        int p = blehh.nextInt();

        if (p < 0) {
            System.out.println("Invalid position");
            return start;
        }
        if (p == 0) {
            newNode.next = start;
            start = newNode;
            return start;
        }

        Node tracker = start;

        for (int i = 0; i < p - 1 && tracker != null; i++) {
            tracker = tracker.next;
        }
        if (tracker == null) {
            System.out.println("Invalid position");
            return start;
        }
        
        newNode.next = tracker.next;
        tracker.next = newNode;

        return start;
    }
    public static Node DelBeg(Node start) {
        if (start == null) {
            return start;
        }
        else if (start.next == null) {
            return null;
        }

        Node tracker = start.next;
        start.next = null;
        start = tracker;
        return start;
    }
    public static Node DelEnd(Node start) {
        if (start == null) {
            return start;
        }
        else if (start.next == null) {
            return null;
        }
        Node tracker = start;

        while (tracker.next.next != null) {
            tracker = tracker.next;
        }
        tracker.next = null;
        return start;
    }
    public static Node DelAny(Node start) {
        if (start == null) {
            return start;
        }
        Node tracker = start;
        int size = 0;

        while (tracker != null) {
            size++;
            tracker = tracker.next;
        }

        System.out.print("Enter pos: ");
        int p = blehh.nextInt();
        if (p >= size || p < 0) {
            System.out.println("Invalid position");
            return start;
        }
        else if (p == size - 1) {
            while (tracker.next.next != null) {
                tracker = tracker.next;
            }
            tracker.next = null;
            return start;
        }
        else if (p == 0) {
            return start.next;
        }

        tracker = start;
        for (int i = 0; i < p - 1; i++) {
            if (tracker.next != null) {
                tracker = tracker.next;
            }
        }
        tracker.next = tracker.next.next;
        return start;
    }

    public static void main(String[] args) {

        while(true) {
            System.out.println("*****-MENU-*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3.InsBeg");

            System.out.print("Enter the choice: ");
            int choice = blehh.nextInt();
            switch(choice) {
                case 0 :
                    System.exit(0);
                case 1 :
                    create(Main.start); break;
                case 2 :
                    display(Main.start); break;
                case 3 :
                    start = InsBeg(Main.start); break;
                case 4 :
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                default :
                    System.out.println("Wrongchoice");
            }
        }      
    }
}




/*
        Node tracker = Main.start;

        for (int i = 0; i < n; i++) {

                System.out.print("Enter reg: ");
                int r = blehh.nextInt();
                System.out.print("Enter marks: ");
                float m = blehh.nextFloat();

                Node newNode = new Node(r, m);

            if (start == null) {
                start = newNode;
                tracker = newNode;
            }
            else {
                tracker.next = newNode;
                tracker = tracker.next;
            }
        }
*/