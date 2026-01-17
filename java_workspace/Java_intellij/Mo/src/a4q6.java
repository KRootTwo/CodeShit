import java.util.Scanner;

public class a4q6 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Entre numero: ");
        int a = blehh.nextInt();

//        String rev = "";
//        int n = a;
//        int i = 0 ;
//        do {
//            rev += n % 10;
//            n /= 10 ;
//        } while (n > 0);
//        int m = Integer.parseInt(rev);
//        System.out.println(rev);
//        System.out.println(m + 1);



        int rev=0;                 
                                   
        int i=a;                   
        while(i>0){                
            rev=rev*10+(i%10);     
            i/=10;                 
        }                          
        System.out.println(rev);   

    }
}
