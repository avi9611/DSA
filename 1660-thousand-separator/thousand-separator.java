class Solution {
    public String thousandSeparator(int n) {
        // Step 1: Convert integer to string
        String num = String.valueOf(n);
        
        // Step 2: Use StringBuilder for easy manipulation
        StringBuilder sb = new StringBuilder();
        
        // Step 3: Counter to track number of digits processed
        int count = 0;
        
        // Step 4: Traverse from end to start
        for (int i = num.length() - 1; i >= 0; i--) {
            sb.append(num.charAt(i));  // Add current digit
            count++;
            
            // After every 3 digits, add a dot (except if it's the last digit)
            if (count % 3 == 0 && i != 0) {
                sb.append('.');
            }
        }
        
        // Step 5: Reverse the string to correct order
        return sb.reverse().toString();
    }
}
