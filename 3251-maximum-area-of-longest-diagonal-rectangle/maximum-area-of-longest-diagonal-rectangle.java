class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = 0;
        int maxArea = 0;

        for(int[] rect: dimensions){
            int l = rect[0];
            int w = rect[1];

            int diagSqr = l * l + w * w;
            int area = l * w;

            if(diagSqr > maxDiag){
                maxDiag = diagSqr;
                maxArea = area;
            } else if(diagSqr == maxDiag){
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}