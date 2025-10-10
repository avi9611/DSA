class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsCnt = new int[26];
        for(char c: chars.toCharArray()){
            charsCnt[c - 'a']++;
        }
        int totalLength = 0;
        for(String word: words){
            int[] wordCnt = new int[26];
            for(char c: word.toCharArray()){
                wordCnt[c - 'a']++;
            }
            boolean canForm = true;
            for(int i = 0; i < 26; i++){
                if(wordCnt[i] > charsCnt[i]){
                    canForm = false;
                    break;
                }
            }
            if(canForm){
                totalLength += word.length();
            }
        }
        return totalLength;
    }
}