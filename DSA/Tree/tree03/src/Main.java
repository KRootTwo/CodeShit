import java.util.ArrayList;
import java.util.List;

public class Main {
    class Node {
        int data;
        List<Node> children;
        

        Node(int x) {
            data = x;
            children = new ArrayList<>();
        }
    }

}
