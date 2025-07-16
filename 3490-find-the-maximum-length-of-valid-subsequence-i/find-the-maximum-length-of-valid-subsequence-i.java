class Solution {
    public int maximumLength(int[] nums) {
        int k = 2;
        int[][] freq = new int[k][k];
        int maxLen = 0;

        for(int num: nums){
            num %= k;
            for(int j = 0; j < k; j++){
                int x = (j - num + k) % k;
                freq[num][x] = freq[x][num] + 1;
                maxLen = Math.max(maxLen, freq[num][x]);
            }
        }
        return maxLen;
    }
}