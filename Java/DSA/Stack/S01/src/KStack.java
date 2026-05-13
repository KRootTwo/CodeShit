public class KStack {
	protected int data[];
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public KStack(int size) {
        this.data = new int[size];
    }
    public KStack() {
        this(DEFAULT_SIZE);
    }

    public int getSize() {
        return ptr + 1;
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("can't push in a full stack");
            return false;
        }
        data[++ptr] = item;
        return true;
    }
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't pop from an empty stack");
        }
        return data[ptr--];
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't peek in an empty stack");
        }
        return data[ptr];
    }
    public void display() {
        for (int i = ptr; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
    public void kDisplay() {
        System.out.println("------");

        for (int i = data.length - 1; i >= 0; i--) {
            if (i <= ptr) {
                System.out.println("| " + data[i] + " |");
            } else {
                System.out.println("|    |");
            }
            System.out.println("------");
        }
    }
}
