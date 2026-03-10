class Book {
    int bookId;
    double price;
    int quantity;
    static double totalAmount;

    Book(int bookId, double price, int quantity) {
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
        totalAmount += quantity;
    }

    void displayDetails() {
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Total Amount: " + totalAmount);
    }
}
class Q03 {
    public static void main(String[] args) {
        Book b[] = new Book[5];
        b[0] = new Book(1243, 67.08, 2);
        b[1] = new Book(1293, 69.99, 3);
        b[2] = new Book(4334, 34.07, 4);
        b[3] = new Book(8256, 200.98, 1);
        b[4] = new Book(0762, 219.87, 3);
        for (int i = 0; i < b.length; i++) {
            b[i].displayDetails();
            System.out.println();
        }
    }
}