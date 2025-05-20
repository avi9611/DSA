class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subSum(nums, goal) - subSum(nums, goal - 1);
    }

    private int subSum(int[] nums, int goal){
        if(goal < 0) return 0;

        int left = 0, cnt = 0, sum = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            cnt += right - left + 1;
        }
        return cnt;
    }
}