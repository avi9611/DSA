class Solution {
    public int maxSum(int[] nums) {
        int maxi = Arrays.stream(nums).max().getAsInt();
        if(maxi <= 0) return maxi;

        boolean[] seen = new boolean[201];
        int sum = 0;

        for(int num: nums){
            if(num < 0 || seen[num]){
                continue;
            }
            sum += num;
            seen[num] = true;
        }
        return sum;
    }
}