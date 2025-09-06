class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double window = 0;

        for(int i = 0; i < k; i++){
            window += nums[i];
        }

        double maxSum = window;
        for(int i = k; i < nums.length; i++){
            window += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, window);
        }
        return maxSum / k;
    }
}