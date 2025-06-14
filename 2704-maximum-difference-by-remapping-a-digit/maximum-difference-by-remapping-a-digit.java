class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int maxV = Integer.MIN_VALUE;
        int minV = Integer.MAX_VALUE;

        for(char d1 = '0'; d1 <= '9'; d1++){
            for(char d2 = '0'; d2 <= '9'; d2++){
                StringBuilder sb = new StringBuilder();
                for(char c: s.toCharArray()){
                    if(c == d1){
                        sb.append(d2);
                    } else {
                        sb.append(c);
                    }
                }
                int newN = Integer.parseInt(sb.toString());
                maxV = Math.max(maxV, newN);
                minV = Math.min(minV, newN);
            }
        }
        return maxV - minV;
    }
}