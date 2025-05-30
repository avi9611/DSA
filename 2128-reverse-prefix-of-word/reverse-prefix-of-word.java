class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = -1;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                idx = i;
                break;
            }
        }
        if(idx == -1) return word;

        char[] res = new char[word.length()];

        for(int i = 0; i <= idx; i++){
            res[i] = word.charAt(idx - i);
        }
        for(int i = idx + 1; i < word.length(); i++){
            res[i] = word.charAt(i);
        }
        return new String(res);
    }
}