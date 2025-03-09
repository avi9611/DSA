class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int cnt = 0;
        int validCnt = 0;

        for(int i = 0; i < k - 1; i++){
            if(colors[i] != colors[i + 1]){
                validCnt++;
            }
        }

        if(validCnt == k - 1) cnt++;

        for(int i = 1; i < n; i++){
            int prevIdx = (i - 1) % n;
            int newEndIdx = (i + k - 2) % n;

            if(colors[prevIdx] != colors[(prevIdx + 1) % n]){
                validCnt--;
            }

            if(colors[newEndIdx] != colors[(newEndIdx + 1) % n]){
                validCnt++;
            }

            if(validCnt == k - 1) cnt++;
        }
        return cnt;
    }
}