class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26]; // since we only have lowercase letters

        // Count letters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false; // Not enough of character c
            }
            freq[c - 'a']--;
        }

        return true;
    }
}
