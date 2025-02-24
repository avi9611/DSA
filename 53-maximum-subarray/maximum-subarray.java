class Solution {
    public static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE, sum=0;

        for(int num: nums){
            sum = Math.max(num, sum+num);
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
}