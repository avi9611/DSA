class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                //if the next two element size out of bound we cannot flip
                if(i + 2 >= n){
                    return -1;
                }
                //use XOR to flip the next two element after zero is encountered
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                res++;
            }
        }
        return res;
    }
}