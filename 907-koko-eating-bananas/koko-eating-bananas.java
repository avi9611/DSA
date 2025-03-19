class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minS = 1;
        int maxS = (int) 1e9;

        // binary Search
        while(minS < maxS){
            int midS = minS + (maxS - minS) / 2;

            int time = 0;

            for(int p: piles){
                time += (p + midS - 1) / midS;
            }

            if(time <= h){
                maxS = midS;
            } else {
                minS = midS + 1;
            }
        }
        return minS;
    }
}