import java.util.ArrayList;

public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        ArrayList <Integer>al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                al.add(i);
            }
        }
        int res[] = new int[2];
        if (al.size() == 1) {
            res[0] = al.getFirst();
            res[1] = al.getFirst();
        }
        else if (al.size() == 2) {
            res[0] = al.getFirst();
            res[1] = al.getLast();
        }
        else if (al.isEmpty()) {
            res[0] = -1;
            res[1] = -1;
        }
        else {
            res[0] = al.getFirst();
            res[1] = al.getLast();
        }
        return res;
    }

}
