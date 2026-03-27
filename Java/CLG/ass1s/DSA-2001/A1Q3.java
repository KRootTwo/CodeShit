import java.util.*;
public class A1Q3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); int num = n; int s = 0; int p = 1;
        while (n !=0){
            int d = n%10;
            s+=d;p*=d;n/=10;
        }
        if (s == p)
            System.out.println(num + " is a spy number.");

    }
    
}
