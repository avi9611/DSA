class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

        for(int k: freqMap.keySet()){
            if(freqMap.containsKey(k + 1)){
                int len = freqMap.get(k) + freqMap.get(k + 1);
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}