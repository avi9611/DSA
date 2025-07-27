class Solution {
    public int countHillValley(int[] nums) {
        int cnt = 0;
        for(int curr = 1, prev = 0; curr < nums.length - 1; curr++){
            if(nums[curr] == nums[curr + 1]){
                continue;
            }
            if(nums[curr] > nums[prev] && nums[curr] > nums[curr + 1]){
                cnt++;
            }
            if(nums[curr] < nums[prev] && nums[curr] < nums[curr + 1]){
                cnt++;
            }
            prev = curr;
        }
        return cnt;
    }
}