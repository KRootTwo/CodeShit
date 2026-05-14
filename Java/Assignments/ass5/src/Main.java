
import java.util.Scanner;


class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    } 
}



public class Main {

    static Scanner in = new Scanner(System.in);
    static Node start = null;
    static Node end = null;

    public static Node create(Node start, Node end) {
        System.out.print("How many nodes: ");
        int n = in.nextInt();
        Node trk = end;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter reg & marks: ");
            int r = in.nextInt();
            float m = in.nextFloat();

            Node newNode = new Node(r, m);

            if (start == null) {
                start = newNode;
                end = newNode;
                trk = newNode;
            } else {
                trk.next = newNode;
                newNode.prev = trk;

                trk = newNode;
                end = newNode;
            }
        }

        Main.start = start;
        return end;
    }
    public static Node insBeg (Node start, Node end) {
        System.out.print("Enter reg & marks: ");
        int r = in.nextInt();
        float m = in.nextFloat();

        Node newNode = new Node(r, m);

        if (start == null) {
            start = newNode;
            end = newNode;
        }
        else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return start;
    }
    public static Node insEnd (Node start, Node end) {
        System.out.print("Enter reg & marks: ");
        int r = in.nextInt();
        float m = in.nextFloat();

        Node newNode = new Node(r, m);

        if (start == null) {
            start = newNode;
            end = newNode;
        }  
        else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return start;
    }
    public static Node insAny (Node start, Node end) {
        int size = 0;
        System.out.print("Enter index to ins: ");
        int id = in.nextInt();

        for (Node node = start; node != null; node = node.next) {
            size++;
        }

        if (id < 0 || id > size) {
            throw new IndexOutOfBoundsException("invalid index mate");
        }

        System.out.print("Enter reg & marks: ");
        int r = in.nextInt();
        float m = in.nextFloat();

        Node newNode = new Node(r, m);
        
        if (id == 0) {
            if (start == null) {
                start = newNode;
                end = newNode;

                Main.end = end;
                return start;
            }

            newNode.next = start;
            start.prev = newNode;
            start = newNode;

            return start;
        }
        else if (id == size) {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;

            Main.end = end;
        }

        Node trk = start;
        for (int i = 0; i < id - 1; i++) {
            trk = trk.next;    
        }
        newNode.next = trk.next;
        trk.next.prev = newNode;
        trk.next = newNode;
        newNode.prev = trk;
        return start;
    }
    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            return start;
        }
        else if (start.next == null) {
            start = null;
            end = null;
            return start;
        }
        start = start.next;
        start.prev = null;
        Main.end = end;
        return start;
    }
    public static Node delEnd(Node start, Node end) {
        if (end == null || start == null) {
            return start;
        }
        else if (end.prev == null) {
            end = null;
            start = null;
            return start;
        }
        end = end.prev;
        end.next = null;
        Main.end = end;
        return start;
    }
    public static Node delAny(Node start, Node end) {
        if (start == null) {
            return start;
        }

        int size = 0;
        System.out.print("Enter index to del: ");
        int id = in.nextInt();

        for (Node node = start; node != null; node = node.next) {
            size++;
        }

        if (id < 0 || id > size - 1) {
            throw new IndexOutOfBoundsException("invalid index mate");
        }
        else if (id == 0) {
            start = start.next;
            start.prev = null;
            return  start;
        }
        else if (id == size - 1) {
            end = end.prev;
            end.next = null;
        }

        Node trk = start;
        for (int i = 0; i < id - 1; i++) {
            trk = trk.next;    
        }

        trk.next.next.prev = trk;
        trk.next = trk.next.next;
        return start;
    }
    public static void search(Node start) {
        if (start == null) {
            return;
        }

        System.out.print("Enter reg to mod: ");
        int sr = in.nextInt();

        Node trk = start;
        while (trk != null && trk.regd_no != sr) {
            trk = trk.next;
        }

        if (trk == null) {
            throw new IllegalArgumentException("Invalid reg mate");
        }

        System.out.print("Enter new marks: ");
        int nm = in.nextInt();

        trk.mark = nm;
    }
    public static void display(Node start, Node end) {
        for (Node trk = start; trk != null; trk = trk.next) {
            System.out.println("Reg: " + trk.regd_no);
            System.out.println("Marks: " + trk.mark);
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("**** MENU ****");
            System.out.println("0 : Exit");
            System.out.println("1 : Create");
            System.out.println("2 : Display");
            System.out.println("3 : Insert Beginning");
            System.out.println("4 : Insert End");
            System.out.println("5 : Insert Any");
            System.out.println("6 : Delete Beginning");
            System.out.println("7 : Delete End");
            System.out.println("8 : Delete Any");
            System.out.println("9 : Search & Modify");

            System.out.print("\nEnter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 0: System.exit(0);

                case 1: end = create(start, end); break;

                case 2: display(start, end); break;

                case 3: start = insBeg(start, end); break;

                case 4: start = insEnd(start, end); break;

                case 5: start = insAny(start, end); break;

                case 6: start = delBeg(start, end); break;

                case 7: start = delEnd(start, end); break;

                case 8: start = delAny(start, end); break;

                case 9: search(start); break;

                default: System.out.println("Wrong choice");
            }
        }
    }    
}
