class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 1000000;

        while(low < high){
            int mid = (low + high) >> 1;

            int sum = 0;
            for(int num: nums){
                sum += (num + mid - 1) / mid;
            }

            if(sum <= threshold){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}