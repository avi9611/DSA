class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int arr1_0s = 0, arr2_0s = 0;
        for(int num : nums1){
            if(num == 0) arr1_0s++;
            sum1 += num;
        }

        for(int num : nums2){
            if(num == 0) arr2_0s++;
            sum2 += num;
        }

        sum1 += arr1_0s;
        sum2 += arr2_0s;

        if(sum2 > sum1 && arr1_0s == 0){
            return -1;
        } 
        if(sum1 > sum2 && arr2_0s == 0){
            return -1;
        }
        return Math.max(sum1, sum2);
    }
}