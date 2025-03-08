class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minOp = k;
        int whiteCnt = 0;

        // Count white blocks in the first window
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                whiteCnt++;
            }
        }
        minOp = whiteCnt;

        // Slide the window across the string
        for(int i = k; i < n; i++){
            // Remove leftmost character and add rightmost character
            if(blocks.charAt(i - k) == 'W'){
                whiteCnt--;
            }
            if(blocks.charAt(i) == 'W'){
                whiteCnt++;
            }

             // Update the minimum operations required
            minOp = Math.min(minOp, whiteCnt);

            // Early exit: If we ever reach 0, return immediately
            if(minOp == 0){
                return 0;
            }
        }
        return minOp;
    }
}