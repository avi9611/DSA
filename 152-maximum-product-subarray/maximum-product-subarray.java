class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1, suffix = 1, result = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            // If prefix is 0, reset to 1 (restart subarray product)
            prefix = (prefix == 0) ? 1 : prefix;
            suffix = (suffix == 0) ? 1 : suffix;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            result = Math.max(result, Math.max(prefix, suffix));
        }
        return result;
    }
}