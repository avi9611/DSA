class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }

        int maxO = Integer.MIN_VALUE;
        int minE = Integer.MAX_VALUE;

        for(int cnt: freq){
            if(cnt > 0){
                if(cnt % 2 == 1){
                    maxO = Math.max(maxO, cnt);
                } else{
                    minE = Math.min(minE, cnt);
                }
            }
        }
        return maxO - minE;
    }
}