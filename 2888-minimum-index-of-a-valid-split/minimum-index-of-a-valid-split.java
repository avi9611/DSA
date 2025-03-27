class Solution {
    public int minimumIndex(List<Integer> nums) {
        int highFreqNum = 0;
        int maxFreq = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Find the Most Frequent (Dominant) Element
        for(int value: nums){
            int currFreq = freqMap.merge(value, 1, Integer::sum);
            if(maxFreq < currFreq){
                maxFreq = currFreq;
                highFreqNum = value;
            }
        }

        // Find the Minimum Valid Split Index
        int freqCnt = 0;
        for(int i = 1; i <= nums.size(); i++){
            if(nums.get(i - 1).equals(highFreqNum)){
                freqCnt++;
                if(freqCnt * 2 > i && (maxFreq - freqCnt) * 2 > nums.size() - i){
                    return i - 1;
                }
            }
        }
        return -1;
    }
}