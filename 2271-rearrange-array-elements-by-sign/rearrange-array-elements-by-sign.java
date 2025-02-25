class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int [n];

        int posNum = 0;
        int negNum = 1;

        for(int num: nums){
            if(num > 0){
                result[posNum] = num;
                posNum += 2;
            } else {
                result[negNum] = num;
                negNum += 2;
            }
        }
        return result;
    }
}