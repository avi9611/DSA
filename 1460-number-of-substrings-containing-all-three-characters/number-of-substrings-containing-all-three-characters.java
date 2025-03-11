class Solution {
    public int numberOfSubstrings(String s) {
        // Count occurrences of 'a', 'b', 'c'
        int[] cnt = {0, 0, 0};
        int left = 0, result = 0;

        for(int right = 0; right < s.length(); right++){
            // Increment count of current character
            cnt[s.charAt(right) - 'a']++;

            while(cnt[0] > 0 && cnt[1] > 0 && cnt[2] > 0){
                // Count valid substrings
                result += s.length() - right;
                // Shrink the window from left
                cnt[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }
}