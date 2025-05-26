class Solution {
    public int minTimeToType(String word) {
        int total = 0;
        char curr = 'a';

        for(char ch: word.toCharArray()){
            int diff = Math.abs(curr - ch);
            int minSteps = Math.min(diff, 26 - diff);
            total += minSteps + 1;
            curr = ch;
        }
        return total;
    }
}