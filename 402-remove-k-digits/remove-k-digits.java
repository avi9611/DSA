class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()) return "0";

        StringBuilder stack = new StringBuilder();

        for(char digit: num.toCharArray()){
            while(k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > digit){
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }
        while(k > 0){
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        int i = 0;
        while(i < stack.length() && stack.charAt(i) == '0'){
            i++;
        }

        String res = stack.substring(i);

        return res.isEmpty() ? "0" : res;
    }
}