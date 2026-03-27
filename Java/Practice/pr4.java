import java.util.Scanner;
public class pr4 {
    public static int max(int b[]){
        int max=b[0];
        for (int i = 0; i < b.length; i++) {
            if(b[i]>max){
                max=b[i];
            }
        }
        return max;
    }
    public static void main (String[] args) {
        int []arr={1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int a=sc.nextInt();

        int b[] = new int[a];
        System.out.println("Enter array: ");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
        System.out.println("Max value: " + max(b));
    }
}
