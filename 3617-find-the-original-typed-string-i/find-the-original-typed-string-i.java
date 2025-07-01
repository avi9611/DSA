import java.util.*;

class Solution {
    public int possibleStringCount(String word) {
        Set<String> result = new HashSet<>();
        result.add(word); 

        int n = word.length();
        for (int i = 0; i < n;) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int len = j - i;
            if (len > 1) {
                // Try removing 1 to len-1 characters
                for (int remove = 1; remove < len; remove++) {
                    String modified = word.substring(0, i) +
                                      repeat(word.charAt(i), len - remove) +
                                      word.substring(j);
                    result.add(modified);
                }
            }
            i = j;
        }

        return result.size();
    }

    private String repeat(char ch, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) sb.append(ch);
        return sb.toString();
    }
}
