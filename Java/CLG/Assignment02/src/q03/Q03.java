//  In a super market each product is having minimum details like prodId, price, quantity
// that is used during the biling process. Keeping this in mind prepare a class named as
// Product having the member variables
//  prodId, price, quantity
//  a static variable totalPrice
// Initialize the value of product through parameterized constructor. It consists of a
// display() method to display the value of instance variables. A person went to market
// and purchase 5 different products. Using the above mentioned class, display the details
// of products that the person has purchased. Also, determine how much total amount
// the person will pay for the purchase of 5 products.
class Product {
    String prodId;
    float price;
    int quantity;
    static float totalPrice;

    public Product(String prodId, float price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += (price * quantity);
    }
    public void display() {
        System.out.println("Poduct ID - " + prodId);
        System.out.printf("Price - %.2f\n", price);
        System.out.println("Quantity - " + quantity);
        System.out.printf("Total Price - %.2f\n", totalPrice);
        System.out.println();
    }
}
class Q03 {
    public static void main(String[] args) {
        Product p1 = new Product("Book", 67.4f, 2);
        p1.display();
        Product p2 = new Product("Pen", 9.99f, 5);
        p2.display();
        Product p3 = new Product("Pencil", 4.55f, 3);
        p3.display();
        Product p4 = new Product("Eraser", 3.99f, 2);
        p4.display();
        Product p5 = new Product("Ink", 12.34f, 1);
        p5.display();
    }
}