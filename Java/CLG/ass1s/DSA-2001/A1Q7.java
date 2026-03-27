import java.util.Scanner;
public class A1Q7 {
    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }
    }
    
    public static int findMax(int [] arr){
        int max = arr[0];
        for(int i = 1 ; i < arr.length;i++){
            if (arr[i]> max)
                max = arr[i];
        }return max;
    }
    public static int findMin(int [] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length;i++){
            if (arr[i]< min)
                min = arr[i];
        }return min;
        
    }
    public static int countOccurences(int [] arr, int value){
        int c = 0;
        for (int i = 0; i< arr.length; i ++){
            if (arr[i]== value)
                c++;
        }
        return c;
    }
    public static int firstPostionOfMax(int [] arr, int max){
        for( int i = 0 ; i < arr.length ; i++){  
            if ( arr[i] == max)
                return i+1;
        }return -1;
    }
    public static int lastPostionOfMin(int [] arr, int min){
        for( int i = arr.length-1 ; i >=0 ; i--){  
            if ( arr[i] == min)
                return i+1;
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();
        int [] A = new int[n];
        readArray(A);
        System.out.println("Maximum value: "+ findMax(A));
        System.out.println("It occurs "+ countOccurences(A, findMax(A))+ " time(s)");
        System.out.println("First position of maximum: "+ firstPostionOfMax(A, findMax(A)));
       
        System.out.println("Minimum value: "+ findMin(A));
        System.out.println("It occurs "+ countOccurences(A, findMin(A))+ " time(s)");
        System.out.println("Last position of minimum: "+ lastPostionOfMin(A,findMin(A)));
    }
}

    

