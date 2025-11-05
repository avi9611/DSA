class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int goodPair = 0;
        for(int num: nums){
            goodPair += freq.getOrDefault(num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return goodPair;
    }
}