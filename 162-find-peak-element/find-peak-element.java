class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        // standard binary search
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]){
                // Peak is in the left half (including mid)
                right = mid;
            } else {
                // Peak is in the right half (excluding mid)
                left = mid + 1;
            }
        }
        return left;
    }
}