import java.util.*;
public class A1QH15 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] A = new int[4][4];
        System.out.println("Random generated Matrix (0 and 1): ");
        for (int i = 0; i< 4;i++ ){
            for (int j = 0; j< 4;j++ ){
                A[i][j] = (int)(Math.random()*2);
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
        int maxRowIndex = 0;
        int maxRowCount = 0;
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += A[i][j];
            }
            if (sum > maxRowCount) {
                maxRowCount = sum;
                maxRowIndex = i;
            }
        }
        int maxColIndex = 0;
        int maxColCount = 0; 
        for (int j = 0; j < 4; j++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += A[i][j];
            }

            if (sum > maxColCount) {
                maxColCount = sum;
                maxColIndex = j;
            }
        }
        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
        }
    }
