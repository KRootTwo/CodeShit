import java.util.*;
public class A1QH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int [] A = new int [n];
        int [] B = new int [n];
        int [] C = new int [n];
        System.out.print("Enter the elements of the ARRAY A: ");
        readarr(A);
        System.out.print("Enter the elements of the ARRAY B: ");
        readarr(B);
        for (int i = 0; i<C.length; i++){
            C[i] = A[i]*B[i];
        } 
        System.out.println("The Product in form of array is: ");
        for (int i = 0; i<C.length; i++){
            System.out.print(C[i] + " " );
        } 

    }
    public static void readarr(int [] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        } 
    }
    
}
