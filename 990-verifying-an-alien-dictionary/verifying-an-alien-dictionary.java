class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];
        for(int i = 0; i < order.length(); i++){
            rank[order.charAt(i) - 'a'] = i;
        }
        for(int i = 0; i < words.length - 1; i++){
            if(!correctOrder(words[i], words[i + 1], rank)){
                return false;
            }
        }
        return true;
    }
    private boolean correctOrder(String w1, String w2, int[] rank){
        int n = Math.min(w1.length(), w2.length());

        for(int i = 0; i < n; i++){
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);

            if(c1 != c2){
                if(rank[c1 - 'a'] > rank[c2 - 'a']){
                    return false;
                } else {
                    return true;
                }
            }
        }
        return w1.length() <= w2.length();
    }
}