import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int []digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int res[] = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
    public static void main(String[] args) {
        // int a[] = {9,8,7,6,5,4,3,2,1,0};
        int a[] = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(a)));

    }
}


/*
        long z = 0;
        for (int i = 0; i < digits.length; i++) {
            z = z * 10 + digits[i];
        }
        z += 1;
        int res[] = new int[String.valueOf(z).length()];
        for (int i = String.valueOf(z).length() - 1; i >= 0; i--) {
            res[i] = (int) z % 10;
            z /= 10;
        }
        return res;



*/