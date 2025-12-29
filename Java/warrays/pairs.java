import java.util.Arrays;
public class pairs {
    public static void pairUp(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("("+ arr[i] +", "+ arr[j] +")\t");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        pairUp(arr);
        String g = Arrays.toString(arr);
        System.out.println(g);
    }
}
