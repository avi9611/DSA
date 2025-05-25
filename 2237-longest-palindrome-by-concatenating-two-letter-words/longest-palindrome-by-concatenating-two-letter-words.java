class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int len = 0;
        boolean hasCentralPal = false;

        for(String word: words){
            String reversed = "" + word.charAt(1) + word.charAt(0);
            if(map.getOrDefault(reversed, 0) > 0){
                len += 4;
                map.put(reversed, map.get(reversed) - 1);
            } else {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        for(String word: map.keySet()){
            if(word.charAt(0) == word.charAt(1) && map.get(word) > 0){
                hasCentralPal = true;
                break;
            }
        }
        if(hasCentralPal){
            len += 2;
        }
        return len;
    }
}