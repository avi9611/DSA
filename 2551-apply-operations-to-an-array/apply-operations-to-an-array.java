class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Process the operations
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Shift non-zero elements to the left
        int index = 0;
        for(int num: nums){
            if(num != 0){
                nums[index++] = num;
            }
        }

        // Fill the remaining positions with 0
        while(index < n){
            nums[index++] = 0;
        }

        return nums;
    }
}