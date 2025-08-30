class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashSets to track numbers seen in rows, cols, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        
        // Traverse the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                
                if (num == '.') continue;  // Skip empty cells
                
                // Box index formula → (row/3)*3 + (col/3)
                int boxIndex = (i / 3) * 3 + (j / 3);
                
                // Check for duplicates
                if (rows[i].contains(num) || cols[j].contains(num) || boxes[boxIndex].contains(num)) {
                    return false;
                }
                
                // Add number to row, col, and box
                rows[i].add(num);
                cols[j].add(num);
                boxes[boxIndex].add(num);
            }
        }
        
        return true;
    }
}
