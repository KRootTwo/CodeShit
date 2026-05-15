import java.util.Scanner;

//                 Create a program to calculate the Area of a Triangle.
//                            Area of triangle = ½*B*H

public class i11_AreaTri {
    public static void main(String[] args) {
        Scanner ahh = new Scanner(System.in) ;
        System.out.print("Height of the Triangle(in metres) H = ");
        float height = ahh.nextFloat();
        System.out.print("Gound/Base of the Triangle(in metres) B = ");
        float base = ahh.nextFloat() ;

        System.out.println("Calculating area of that mf triangle...");

        float area = ((base * height)/2);
        System.out.println("Area of that mf is A = " + area + " metres");

    }
}
