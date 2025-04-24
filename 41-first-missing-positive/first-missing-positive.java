class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place numbers in correct index
        for(int i = 0; i < n; i++){
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Find the first place where nums[i] != i + 1
        for(int i = 0; i < n; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        // If all numbers from 1 to n are present
        return n + 1;
    }
}