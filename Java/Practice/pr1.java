import java.util.*;
public class pr1 {
    public static void readArr(int [] arr) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter elements(int): ");
            
        for (int i = 0; i < arr.length; i++) {
            int s = blehh.nextInt();
            arr[i] = s;
        }
        blehh.close();
    }
    public static void prntArr(int [] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int[] elmDupes(int[] arr) {
        int temp[] = new int[arr.length];
        int c = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean dup = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                temp[c] = arr[i];
                c++;
            }
        }
        int fn[] = new int [c];
        System.arraycopy(temp, 0, fn, 0, c);
        return fn;
    }
    public static void main(String[] args) {
        Scanner shit = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int s = shit.nextInt();

        int [] siuuu = new int [s];
        readArr(siuuu);
        prntArr(siuuu);
        int []g = elmDupes(siuuu);
        prntArr(g);

        shit.close();
    }
}


/*
System.arraycopy(
    temp,   // source array
    0,      // starting index in source
    rs,     // destination array
    0,      // starting index in destination
    count   // number of elements to copy
);
Arrays.copyOf(
    temp,   // source array
    count   // length of the new array & number of elements copied
);

System.arraycopy(temp, 0, rs, 0, count);
int[] rs = Arrays.copyOf(temp, count);
*/