class Solution {
    public boolean checkRecord(String s) {
        int ab = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'A'){
                ab++;
                if(ab >= 2){
                    return false;
                }
            }
            if(ch == 'L'){
                if(i >= 2 && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L'){
                    return false;
                }
            }
        }
        return true;
    }
}