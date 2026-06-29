public class Qn643 {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;

        for (int i = 0; i < k; i++) {
            maxAvg += nums[i];
        }
        double sum = maxAvg;

        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            if (sum > maxAvg) {
                maxAvg = sum;
            }
        }
        return maxAvg / k;
    }
}


/*
        // if (nums.length < k) {
        //     double m = 0;
        //     for (int i = 0; i < nums.length; i++) {
        //         m += nums[i];
        //     }
        //     return m / (double) k;
        // }
*/