public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int c = 0, temp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp[c++] = nums[i];
            }
        }
        int a[] = new int[c];
        System.arraycopy(temp, 0, a, 0, c);
        System.arraycopy(temp, 0, nums, 0, c);

        return a.length;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }
}

// arraycopy
//(Object src, int srcPos, Object dest, int destPos, int length)
/*
                int temp = nums[nums.length - 1 - c];
                nums[nums.length - 1 - c] = nums[i];
                nums[i] = temp;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(a));
*/