class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1];

        int repeated = -1, missing = -1;

        // Count occurrences of each number
        for(int[] row: grid){
            for(int num: row){
                count[num]++;
            }
        }

        // Find repeated and missing values
        for(int i = 1; i <= size; i++){
            if(count[i] == 2){
                repeated = i;
            } else if(count[i] == 0){
                missing = i;
            }
        }
        return new int[]{repeated, missing};
    }
}