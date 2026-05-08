import java.util.Arrays;

public class inArray {
    public static int[] hashArr(int a[], int no) {
        int res[] = new int[no];

        for (int i = 0; i < a.length; i++) {
            res[a[i]] += 1;
        }
        return res;
    }

    public static int[] hastArr2(char a[]) {
        int c[] = new int[26];
        for (int i = 0; i < a.length; i++) {
            c[a[i] - 97] += 1;
        }
        return c;
    }
    public static void decrHA2(int c[]) {
        for (int i = 0; i < c.length; i++) {
            char ch = (char) (i + 97);
            System.out.println(ch + " -> " + c[i] + " times");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 7, 8, 9, 0};
        char crr[] = {'a', 'b', 'z', 'e', 'k', 'p', 'd', 'A'};

        int h[] = hashArr(arr, 10);
        System.out.println(Arrays.toString(h));

        decrHA2(hastArr2(crr));
    }
}
