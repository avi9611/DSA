class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        String vowels = "aeiou";

        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                char c = (char) ('a' + i);

                if(vowels.indexOf(c) != -1){
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }
        return maxVowel + maxConsonant;
    }
}