class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;

        // Check if first row needs to be zero
        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }

        // Check if first column needs to be zero
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        // Use first row and column as markers
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Set matrix cells to zero based on markers
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j]=0;
                }
            }
        }

        // Set first row to zero if needed
        if(firstRowZero){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

        // Set first column to zero if needed
        if(firstColZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}