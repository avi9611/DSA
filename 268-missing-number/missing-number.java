class Solution {
    public int missingNumber(int[] nums) {
        int N=nums.length;
        int sum=(N*(N+1))/2;

        int sum2=0;
        for(int i=0; i<N; i++){
            sum2+=nums[i];
        }
        int missingNum=sum-sum2;
        return missingNum;
    }
}