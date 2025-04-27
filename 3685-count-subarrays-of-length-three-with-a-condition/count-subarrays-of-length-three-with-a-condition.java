class Solution {
    public int countSubarrays(int[] nums) {
        int cnt = 0;

        for(int i = 0; i <= nums.length - 3; i++){
            int first = nums[i];
            int middle = nums[i + 1];
            int second = nums[i + 2];

            if(first + second == middle / 2 && middle % 2 == 0){
                cnt++;
            }
        }
        return cnt;
    }
}