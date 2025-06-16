class Solution {
    public int maximumDifference(int[] nums) {
        int minNum = nums[0];
        int maxDiff = -1;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] > minNum){
                maxDiff = Math.max(maxDiff, nums[j] - minNum);
            } else {
                minNum = nums[j];
            }
        }
        return maxDiff;
    }
}