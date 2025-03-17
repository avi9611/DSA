class Solution {
    public boolean divideArray(int[] nums) {
        // 510 because of problem constraints say so
        int[] cnt = new int[510];

        // loop over the array count each occurence of num
        for(int num: nums){
            cnt[num]++;
        }
        // if num count of each distinct num is odd return false else true
        for(int dist: cnt){
            if(dist % 2 != 0){
                return false;
            }
        }
        return true;
    }
}