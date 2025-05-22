class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char c: s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int eFreq = freqMap.get(s.charAt(0));

        for(int freq: freqMap.values()){
            if(freq != eFreq){
                return false;
            }
        }
        return true;
    }
}