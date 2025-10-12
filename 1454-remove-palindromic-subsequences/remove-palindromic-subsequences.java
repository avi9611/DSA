class Solution {
    public int removePalindromeSub(String s) {
        if(s.isEmpty()) return 0;
        int left = 0, right = s.length() - 1;
        while(left < right){
            // Not palindrome requires 2 steps
            if(s.charAt(left) != s.charAt(right)){
                return 2;
            }
            left++;
            right--;
        }
        // It is palindrome requires 1 step
        return 1;
    }
}