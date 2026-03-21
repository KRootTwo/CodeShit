

public class RemoveDuplicatesfromSortedArray {

    public static int  removeDuplicates(int nums[]) {
        int c = 1, temp[] = new int[nums.length];
        temp[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[c++] = nums[i + 1];
            }
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
        return c;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        

        // System.out.println(removeDuplicates(nums));
    }
}


/***
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(temp))
***/