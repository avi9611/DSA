class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int grpCnt = (n + k - 1) / k;
        String[] res = new String[grpCnt];

        for(int i = 0; i < grpCnt; i++){
            int st = i * k;
            int end = Math.min(st + k, n);

            StringBuilder grp = new StringBuilder(s.substring(st, end));

            while(grp.length() < k){
                grp.append(fill);
            }
            res[i] = grp.toString();
        }
        return res;
    }
}