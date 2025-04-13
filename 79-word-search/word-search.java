class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // Start DFS if first character matches
                if(board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index){
         // Base case: all characters matched
        if(index == word.length()) return true;

        // boundary condition
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length 
        || board[i][j] != word.charAt(index)) return false;

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, word, i + 1, j, index + 1) || 
                        dfs(board, word, i - 1, j, index + 1) || 
                        dfs(board, word, i, j + 1, index + 1) || 
                        dfs(board, word, i, j - 1, index + 1);

        board[i][j] = temp;

        return found;
    }
}