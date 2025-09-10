class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        // Start with 1 line
        int lines = 1; 
        // Track current line width
        int currentWidth = 0; 
        
        // Traverse each character in string s
        for (char c : s.toCharArray()) {
            int w = widths[c - 'a']; // find width of current char
            
            // Check if adding this char exceeds 100 pixels
            if (currentWidth + w > 100) {
                lines++;          // need new line
                currentWidth = w; // start new line with this char
            } else {
                currentWidth += w; // continue current line
            }
        }
        
        return new int[]{lines, currentWidth};
    }
}
