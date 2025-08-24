class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int res = 0;

        for (int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeros++;
            }

            while(zeros > 1){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}