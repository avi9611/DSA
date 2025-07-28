class Solution {
    int maxOr = 0;
    int cnt = 0;
    public int countMaxOrSubsets(int[] nums) {
        for(int num: nums){
            maxOr |= num;
        }
        dfs(nums, 0, 0);
        return cnt;
    }
    private void dfs(int[] nums, int idx, int currOr){
        if(idx == nums.length){
            if(currOr == maxOr){
                cnt++;
            }
            return;
        }
        dfs(nums, idx + 1, currOr | nums[idx]);
        dfs(nums, idx + 1, currOr);
    }
}