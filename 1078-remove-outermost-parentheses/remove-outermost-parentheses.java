class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int cnt = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                if(cnt > 0) result.append(c);
                cnt++;
            } else {
                cnt--;
                if(cnt > 0) result.append(c);
            }
        }
        return result.toString();
    }
}