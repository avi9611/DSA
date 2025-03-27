class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int left = 0, right = cols - 1;

        while(left <= right){
            int midCol = left + (right - left) / 2;
            int maxRow = 0;

            // Find the row index where the max element in midCol is located
            for(int i = 0; i < rows; i++){
                if(mat[i][midCol] > mat[maxRow][midCol]){
                    maxRow = i;
                }
            }

            int leftVal = (midCol > 0) ? mat[maxRow][midCol - 1] : -1;
            int rightVal = (midCol < cols - 1) ? mat[maxRow][midCol + 1] : -1;

            // Check if mat[maxRow][midCol] is a peak
            if(mat[maxRow][midCol] > leftVal && mat[maxRow][midCol] > rightVal){
                return new int[]{maxRow, midCol};
            }
            
            // Move towards the larger neighboring element
            if(leftVal > mat[maxRow][midCol]){
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }
        return new int[]{-1, -1};
    }
}