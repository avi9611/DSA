class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int st = 0;

        for(int end = 0; end <= chars.length; end++){
            if(end == chars.length || chars[end] == ' '){
                reverse(chars, st, end - 1);
                st = end + 1;
            }
        }
        return new String(chars);
    }
    private void reverse(char[] chars, int left, int right){
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}