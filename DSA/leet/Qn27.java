public class Qn27 {
	public static int removeElement(int[] nums, int val) {
		int id = 0;
		int arr[] = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				arr[id++] = nums[i];
			}
		}
		System.arraycopy(arr, 0, nums, 0, id);
		for (int i = id; i < nums.length; i++) {
			nums[i] = val;
		}
		return id;
	}
	public static void main(String[] args) {
		

	}

}
