class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1 && trust.length == 0) return 1;
        int[] cnt = new int[n + 1];
        for(int[] t: trust){
            int a = t[0];
            int b = t[1];
            cnt[a]--;
            cnt[b]++;
        }

        for(int i = 1; i <=n; i++){
            if(cnt[i] == n - 1){
                return i;
            }
        }
        return -1;
    }
}