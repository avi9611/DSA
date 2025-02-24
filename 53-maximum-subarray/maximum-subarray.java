class Solution {
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxi = Integer.MIN_VALUE, sum=0;

        for(int i=0; i<n; i++){
            sum+=nums[i];

            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}