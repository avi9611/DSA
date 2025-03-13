class Solution {
    // global variables
    private int n;
    private int[] nums;
    private int[][] queries;

    public int minZeroArray(int[] nums, int[][] queries) {
        this.nums = nums;
        this.queries = queries;
        n = nums.length;
        int m = queries.length;
        int left = 0, right = m + 1;

        // Binary search to find the minimal number of queries needed
        while(left < right){
            int mid = left + (right - left) / 2;
            if(diffArr(mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        // If left exceeds 'm' which is the size of query it means no solution exists
        return left > m ? -1 : left;
    }

    // helper method for difference array just like zero array array transformation-I
    private boolean diffArr(int k){
        int[] diff = new int[n + 1];

        for(int i = 0;i < k; i++){
            int l = queries[i][0], r = queries[i][1], value = queries[i][2];
            diff[l] += value;
            diff[r + 1] -= value;
        }

        for(int i = 0, s = 0; i < n; i++){
            s += diff[i];
            if(nums[i] > s){
                return false;
            }
        }
        return true;
    }
}