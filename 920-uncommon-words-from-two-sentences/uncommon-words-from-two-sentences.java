class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String comb = s1 + " " + s2;

        String[] words = comb.split(" ");
        Map<String, Integer> freqMap = new HashMap<>();
        for(String word: words){
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        List<String> res = new ArrayList<>();
        for(String word: freqMap.keySet()){
            if(freqMap.get(word) == 1){
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}