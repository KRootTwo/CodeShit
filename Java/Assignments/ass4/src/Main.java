
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

        Node trk = Main.start;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter reg: ");
            int r = blehh.nextInt();
            System.out.print("Enter marks: ");
            float m = blehh.nextFloat();

            Node newNode = new Node(r, m);

            if (Main.start == null) {
                Main.start = newNode;
                trk = newNode;
            }
            else {
                trk.next = newNode;
                trk = trk.next;
            }
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
        Node trk = start;

        if (start == null) {
            start = newNode;
        }
        else {
            while (trk.next != null) {
                trk = trk.next;
            }
            trk.next = newNode;
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

        Node trk = start;

        for (int i = 0; i < p - 1 && trk != null; i++) {
            trk = trk.next;
        }
        if (trk == null) {
            System.out.println("Invalid position");
            return start;
        }
        
        newNode.next = trk.next;
        trk.next = newNode;

        return start;
    }
    public static Node DelBeg(Node start) {
        if (start == null) {
            return start;
        }
        else if (start.next == null) {
            return null;
        }

        Node trk = start.next;
        start.next = null;
        start = trk;
        return start;
    }
    public static Node DelEnd(Node start) {
        if (start == null) {
            return start;
        }
        else if (start.next == null) {
            return null;
        }
        Node trk = start;

        while (trk.next.next != null) {
            trk = trk.next;
        }
        trk.next = null;
        return start;
    }
    public static Node DelAny(Node start) {
        if (start == null) {
            return start;
        }
        Node trk = start;
        int size = 0;

        while (trk != null) {
            size++;
            trk = trk.next;
        }

        System.out.print("Enter pos: ");
        int p = blehh.nextInt();
        if (p >= size || p < 0) {
            System.out.println("Invalid position");
            return start;
        }
        else if (p == size - 1) {
            trk = start;

            while (trk.next.next != null) {
                trk = trk.next;
            }

            trk.next = null;
            return start;
        }
        else if (p == 0) {
            return start.next;
        }

        trk = start;
        for (int i = 0; i < p - 1; i++) {
            if (trk.next != null) {
                trk = trk.next;
            }
        }
        trk.next = trk.next.next;
        return start;
    }
    public static void search(Node start) {
        System.out.print("Enter reg: ");
        int r = blehh.nextInt();

        Node trk = start;

        while (trk != null) {
            if (trk.regd_no == r) break;
            trk = trk.next;
        }
        if (trk == null) {
            System.out.println("Invalid registration no.");
            return;
        }

        System.out.print("Enter new marks: ");
        float m = blehh.nextFloat();

        trk.mark = m;
        System.out.println("Marks updated");
    }
    public static void sort(Node start) {
        if (start == null || start.next == null) {
            return;
        }
        Node ptr1, ptr2;

        for (ptr1 = start; ptr1.next != null; ptr1 = ptr1.next) {
            for (ptr2 = start; ptr2.next != null; ptr2 = ptr2.next) {
                
                if (ptr2.next.mark < ptr2.mark) {
                    int t = ptr2.regd_no;
                    ptr2.regd_no = ptr2.next.regd_no;
                    ptr2.next.regd_no = t;

                    float f = ptr2.mark;
                    ptr2.mark = ptr2.next.mark;
                    ptr2.next.mark = f;
                }
            }
        }
    }
    public static int count(Node start) {
        if (start == null) return 0;

        int cnt = 0;
        for(Node t = start; t != null; t = t.next) {
            cnt++;
        }
        return cnt;
    }
    public static Node reverse(Node start) {
        Node prev = null;
        Node curr = start;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void display(Node start) {
        Node trk = start;
        while (trk != null) {
            System.out.println("Reg: " + trk.regd_no);
            System.out.println("Marks: " + trk.mark);
            System.out.println();
            trk = trk.next;
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("0 : Exit");
            System.out.println("1 : Create");
            System.out.println("2 : Display");
            System.out.println("3 : Insert Beginning");
            System.out.println("4 : Insert End");
            System.out.println("5 : Insert Any Position");
            System.out.println("6 : Delete Beginning");
            System.out.println("7 : Delete End");
            System.out.println("8 : Delete Any Position");
            System.out.println("9 : Search & Update Marks");
            System.out.println("10 : Sort");
            System.out.println("11 : Count");
            System.out.println("12 : Reverse");

            System.out.print("Enter choice: ");
            int choice = blehh.nextInt();

            switch (choice) {

                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                case 1:
                    create(start);
                    break;

                case 2:
                    display(start);
                    break;

                case 3:
                    start = InsBeg(start);
                    break;

                case 4:
                    start = InsEnd(start);
                    break;

                case 5:
                    start = InsAny(start);
                    break;

                case 6:
                    start = DelBeg(start);
                    break;

                case 7:
                    start = DelEnd(start);
                    break;

                case 8:
                    start = DelAny(start);
                    break;

                case 9:
                    search(start);
                    break;

                case 10:
                    sort(start);
                    System.out.println("List sorted");
                    break;

                case 11:
                    System.out.println("Total nodes: " + count(start));
                    break;

                case 12:
                    start = reverse(start);
                    System.out.println("List reversed");
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}

