class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 0;
        int right = (int) 1e9;

        // binary search
        // The goal is to find the smallest 'a' for which the 
        // number of valid partitions is at least 'k'
        while( left < right ){
            int mid = (left + right) >> 1;

            if(countPartition(nums, mid) >= k){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    private int countPartition(int[] nums, int a){
        int cnt = 0;
        // make sure adjacent elements are not selected
        int lastPartIdx = -2;

        for(int i = 0; i < nums.length; i++){
            // skipping condition if nums[i] is greater than 'a' and if it is an immediate
            // neightbour
            if(nums[i] > a || i == lastPartIdx + 1){
                continue;
            }
            cnt++;
            lastPartIdx = i;
        }
        return cnt;
    }
}