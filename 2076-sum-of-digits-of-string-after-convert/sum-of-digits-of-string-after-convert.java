class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numStr = new StringBuilder();

        for(char ch: s.toCharArray()){
            int pos = ch - 'a' + 1;
            numStr.append(pos);
        }

        String curr = numStr.toString();
        for(int i = 0; i < k; i++){
            int sum = 0;
            for(char digi: curr.toCharArray()){
                sum += digi - '0';
            }
            curr = String.valueOf(sum);
        }
        return Integer.parseInt(curr);
    }
}