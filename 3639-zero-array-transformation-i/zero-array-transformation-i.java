class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        // difference array
        int[] diff = new int[n + 1];

         // Apply the queries to the difference array
        for (var q : queries) {
            int l = q[0], r = q[1];
            diff[l]++;
            diff[r + 1]--;
        }
        for (int i = 0, s = 0; i < n; i++) {
            s += diff[i];
            if (nums[i] > s) {
                return false;
            }
        }
        return true;
    }
}