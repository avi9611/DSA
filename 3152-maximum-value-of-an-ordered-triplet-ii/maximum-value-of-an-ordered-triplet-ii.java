class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxVal = 0;

        // Precompute suffix max for nums[k]
        long[] suffixMax = new long[n];
        suffixMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], nums[i]);
        }

        long maxPrefix = nums[0];  
        long maxDiff = Long.MIN_VALUE; 

        // Iterate through j and maintain maxPrefix and maxDiff
        for (int j = 1; j < n - 1; j++) {
            maxDiff = Math.max(maxDiff, maxPrefix - nums[j]); 
            long currentMax = maxDiff * suffixMax[j + 1]; 
            maxVal = Math.max(maxVal, currentMax); 
            maxPrefix = Math.max(maxPrefix, nums[j]); 
        }

        return maxVal;
    }
}
