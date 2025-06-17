class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];

        for(char c: s.toCharArray()){
            count[c]++;
        }

        int len = 0;
        boolean oddPre = false;
        for(int freq: count){
            len += freq / 2 * 2;
            if(freq % 2 == 1){
                oddPre = true;
            }
        }
        return oddPre ? len + 1 : len;
    }
}