class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Find the first index of positive number using binary search
        int posIdx = lowerBound(nums, 1);

        // Find the first index of zero using binary search
        int zeroIdx = lowerBound(nums, 0);

        // Number of negative numbers (all before the first zero)
        int negCnt = zeroIdx;

        // Number of positive numbers (all after the first positive index)
        int posCnt = n - posIdx;

        return Math.max(negCnt, posCnt);
    }

    //simple lower bound method
    private int lowerBound(int[] nums, int target){
        int left = 0, right = nums.length;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}