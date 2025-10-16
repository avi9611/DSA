class Solution {
    public String reformat(String s) {
        // Separate letters and digits
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                letters.append(c);
            }
        }
        
        int lenL = letters.length();
        int lenD = digits.length();
        
        // If difference greater than 1, impossible to alternate
        if (Math.abs(lenL - lenD) > 1) return "";
        
        // Determine which to start with
        StringBuilder res = new StringBuilder();
        boolean letterFirst = lenL > lenD;  // Start with letter if there are more letters
        
        int i = 0, j = 0;
        while (i < lenL || j < lenD) {
            if (letterFirst && i < lenL) {
                res.append(letters.charAt(i++));
            }
            if (j < lenD) {
                res.append(digits.charAt(j++));
            }
            // Alternate start next round
            letterFirst = true;
        }
        
        // If digits were more, we need to start with digits instead
        if (lenD > lenL) {
            res = new StringBuilder();
            i = 0; j = 0;
            while (i < lenL || j < lenD) {
                if (j < lenD) res.append(digits.charAt(j++));
                if (i < lenL) res.append(letters.charAt(i++));
            }
        }
        
        return res.toString();
    }
}
