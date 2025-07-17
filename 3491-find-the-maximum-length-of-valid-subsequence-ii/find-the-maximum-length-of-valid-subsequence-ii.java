class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] subLen = new int[k][k];
        int maxLen = 0;

        for(int num: nums){
            int x = num % k;
            for(int j = 0; j < k; j++){
                int y = (j - x + k) % k;
                subLen[x][y] = subLen[y][x] + 1;
                maxLen = Math.max(maxLen, subLen[x][y]);
            }
        }
        return maxLen;
    }
}