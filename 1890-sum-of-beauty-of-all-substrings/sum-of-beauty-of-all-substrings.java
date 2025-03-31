class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeut = 0;

        // Iterate over all starting points of substrings
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];

            // Expand the substring ending at j
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++;
                // Calculate the beauty of the current substring
                totalBeut += getBeut(freq);
            }
        }
        return totalBeut;
    }

    // Helper function to calculate beauty of a substring
    private int getBeut(int[] freq){
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;

        for(int cnt: freq){
            if(cnt > 0){
            maxFreq = Math.max(maxFreq, cnt);
            minFreq = Math.min(minFreq, cnt);
            }
        }
        return maxFreq - minFreq;
    }
}