class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1, result = 0;

        // Ignore leading whitespace
        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        // Check for sign
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits into an integer
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            // Handle overflow and underflow cases
            if(result > (Integer.MAX_VALUE - digit) / 10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}