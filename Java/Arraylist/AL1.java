import java.util.*;

public class AL1 {
    public static void main(String[] args) {

        // init
        ArrayList <Integer> al1 = new ArrayList<>();
        
        // add elements
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);


        // get elements
        int a1 = al1.get(0);

        // add elements in b/w
        al1.add(0, 9);

        // set element
        al1.set(1, 8);

        // delete element
        al1.remove(3);

        // size
        int s = al1.size();

        // iterate
        for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }
        
        // sorting 
        Collections.sort(al1);

        // print
        System.out.println(al1);
        System.out.println(a1);
        System.out.println(s);
    }
}