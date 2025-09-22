class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] cnt = new int[101];
        for(int num: nums){
            cnt[num]++;
        }

        int maxFreq = 0;
        for(int freq: cnt){
            if(freq > maxFreq){
                maxFreq = freq;
            }
        }
        int res = 0;
        for(int freq: cnt){
            if(freq == maxFreq){
                res += freq;
            }
        }
        return res;
    }
}