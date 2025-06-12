class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDif = 0;
        int n = nums.length;

        for(int i = 0;i < n; i++){
            int nextIdx = (i + 1) % n;
            int diff = Math.abs(nums[i] - nums[nextIdx]);
            maxDif = Math.max(maxDif, diff);
        }
        return maxDif;
    }
}