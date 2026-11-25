public class Qn11 {
    public static int mx(int arr[], int low, int high) {
        int mx = arr[low];
        for (int i = low; i < high; i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
        return mx;
    }
    public static int maxArea(int[] height) {
        int area = -1;
        for (int i = 0; i < height.length; i++) {
            int lmx = mx(height, 0, i);
            int rmx = mx(height, i, height.length);
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}