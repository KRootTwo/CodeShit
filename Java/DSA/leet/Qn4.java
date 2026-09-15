import java.util.Arrays;

public class Qn4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med;
        int m = nums1.length, n = nums2.length;
        int merged[] = new int[m + n];

        int id1 = 0, id2 = 0;

        for (int i = 0; i < m + n; i++) {
            
            if (id1 == m) {
                for (int j = id2; j < n; j++) {
                    merged[i++] = nums2[j];
                }
                break;
            }
            else if (id2 == n) {
                for (int j = id1; j < m; j++) {
                    merged[i++] = nums1[j];
                }
                break;
            }
            else if (nums1[id1] < nums2[id2]) {
                merged[i] = nums1[id1++];
            }
            else {
                merged[i] = nums2[id2++];
            }
        }

        int mid = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            med = (double) (merged[mid] + merged[mid - 1]) / 2;
            System.out.println("even " + merged[mid] + merged[mid - 1]);
        }
        else {
            med = merged[mid];
            System.out.println("odd " + merged[mid]);
        }
        
        System.out.println(Arrays.toString(merged));

        return med;
    }

    public static void main(String[] args) {
        // int nums1[] = {2, 4, 6, 3, 7};
        // int nums2[] = {1, 6, 4, 2, 9, 10};
        int nums1[] = {2};
        int nums2[] = {};

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println();
        double e = findMedianSortedArrays(nums1, nums2);
        System.out.println("\n" + e);

    }
}

/*

[2, 3, 4, 6, 7]

[1, 2, 4, 6, 9]
[4, 7, 8, 9, 11]

*/