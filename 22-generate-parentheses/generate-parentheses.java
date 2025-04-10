class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "",0, 0, n );
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max){
        // when the string is complete
        if(current.length() == max * 2){
            result.add(current);
            return;
        }
        // // Add an open parenthesis if we have not used up all open ones
        if(open < max){
            backtrack(result, current + "(", open + 1, close, max);
        }
        // Add a close parenthesis if it won't exceed the open ones
        if(close < open){
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}