import java.util.Scanner;

public class Main1 {
    public static final int MAX=10;
    int S[];
    int top;
    static Scanner in = new Scanner(System.in);

    public static int push(int S[], int top) {

        if (isFull(top)) {
            throw new StackOverflowError("Stack is full lads");
        }

        System.out.print("Enter data: ");
        int n = in.nextInt();

        S[++top] = n;

        return top;
    }
    public static int pop(int S[], int top) {

        if (isEmpty(top)) {
            throw new IllegalStateException("Empty stack");
        }

        S[top] = 0;

        return --top;
    }
    public static void display(int S[],int top) {
        if (top == -1) return;
        for (int i = top; i >= 0; i--) {
            System.out.println(S[i]);
            System.out.println("----");
        }
    }
    public static boolean isEmpty(int top) {
        return top == -1;
    }
    public static boolean isFull(int top) {
        return top == MAX - 1;
    }


    public static void main(String[] args) {

        int stack[] = new int[MAX];
        int top = -1;

        while (true) {

            System.out.println("\n*** MENU ***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();

            switch (choice) {

                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                case 1:
                    top = push(stack, top);
                    break;

                case 2:

                    if (isEmpty(top)) {
                        System.out.println("Stack is empty");
                    } else {

                        int popped = stack[top];

                        top = pop(stack, top);

                        System.out.println("Popped element: " + popped);
                    }

                    break;

                case 3:
                    display(stack, top);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}


