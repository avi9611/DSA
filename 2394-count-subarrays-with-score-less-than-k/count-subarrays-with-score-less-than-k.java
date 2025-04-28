class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count = 0;
        int n = nums.length;
        long sum = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            
            // Shrink window from left if score is >= k
            while (sum * (right - left + 1) >= k) {
                sum -= nums[left];
                left++;
            }
            
            // Number of valid subarrays ending at right is (right - left + 1)
            count += (right - left + 1);
        }
        
        return count;
    }
}
