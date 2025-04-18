class Solution {
    public String countAndSay(int n) {
        // Base case
        if(n == 1) return "1";

        String result = "1";

        // Iterate n - 1 times
        for(int i = 2; i <= n; i++){
            // For building next term
            StringBuilder sb = new StringBuilder();
            int cnt = 1;
            char prevChar = result.charAt(0);

            // Scan the current result
            for(int j = 1; j < result.length(); j++){
                char currChar = result.charAt(j);
                // count repeating chars
                if(currChar == prevChar){
                    cnt++;
                } else{
                    // append current group
                    sb.append(cnt).append(prevChar);
                     // reset
                    prevChar = currChar;
                    cnt = 1;
                }
            }
            // Append the last group
            sb.append(cnt).append(prevChar);
            result = sb.toString();
        }
        return result;
    }
}