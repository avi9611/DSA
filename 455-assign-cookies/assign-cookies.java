import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); 
        Arrays.sort(s); 
        
        int i = 0; // child index
        int j = 0; // cookie index
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // child is content
            }
            j++; // move to next cookie
        }
        
        return i; 
    }
}
