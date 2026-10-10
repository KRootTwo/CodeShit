class Qn69 {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int lo = 1, hi = x / 2, ans = 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid <= x / mid) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}