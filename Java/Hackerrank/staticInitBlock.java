import java.util.*;

public class staticInitBlock {

public static int B;
public static int H;
public static boolean flag = false;

static {
    Scanner blehh = new Scanner(System.in);
    B = blehh.nextInt();
    H = blehh.nextInt();
		if (B > 0 && H > 0) {
			int area = B * H;
			System.out.print(area);
		} else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
}

public static void main(String[] args){
		if(flag){
			int area=B * H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


