class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int num: nums){
            totalSum += num;
        }
        //Track leftSum while iterating
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            // Update leftSum for next iteration
            leftSum += nums[i];
        }
        return -1;
    }
}