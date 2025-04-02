class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxVal = 0;

        int[] maxSuffix = new int[n];
        maxSuffix[n - 1] = nums[n - 1];

        for(int i = n - 2; i >= 0; i--){
            maxSuffix[i] = Math.max(maxSuffix[i + 1], nums[i]); 
        }

        int maxPrefix = nums[0];

        for(int j = 1; j < n - 1; j++){
            if(maxPrefix > nums[j] && maxSuffix[j + 1] > 0){
                maxVal = Math.max(maxVal, (long) (maxPrefix - nums[j]) * maxSuffix[j + 1]);
            }
            maxPrefix = Math.max(maxPrefix, nums[j]);
        }
        return maxVal;
    }
}