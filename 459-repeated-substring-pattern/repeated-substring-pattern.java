class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String trim = doubled.substring(1, doubled.length() - 1);
        return trim.contains(s);
    }
}