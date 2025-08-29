class Solution {
    public int countBinarySubstrings(String s) {
        int prevG = 0;
        int currG = 1;
        int cnt = 0;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                currG++;
            } else {
                cnt += Math.min(prevG, currG);
                prevG = currG;
                currG = 1;
            }
        }
        cnt += Math.min(prevG, currG);
        return cnt;
    }
}