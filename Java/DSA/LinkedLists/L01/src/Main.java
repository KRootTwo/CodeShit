public class Main {
    public static void main(String[] args) {
        LL<Integer> list = new LL<>();
        
        list.insertT(81);
        list.insertH(31);
        list.insertH(21);
        list.insertT(91);

        list.display();

        // list.deleteH();
        // list.deleteT();

        list.display();

        list.reverse();

        list.display();
    }
}
