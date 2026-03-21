import java.util.Arrays;
public class TwoSum {
    public static int[] twosum(int[] nums, int target) {
        int r[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    r[0] = i;
                    r[1] = j;
                    break;
                }
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 2};
        System.out.println(Arrays.toString(twosum(arr, 9)));
    }
}
