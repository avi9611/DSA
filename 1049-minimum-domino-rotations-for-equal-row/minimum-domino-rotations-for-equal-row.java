class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res = check(tops[0], tops, bottoms);

        if(res != -1) return res;

        return tops[0] != bottoms[0] ? check(bottoms[0], tops, bottoms) : -1;
    }

    private int check(int target, int[] tops, int[] bottoms){
        int topR = 0;
        int bottomR = 0;

        for(int i = 0; i < tops.length; i++){
            if(tops[i] != target && bottoms[i] != target){
                return -1;
            } else if (tops[i] != target){
                topR++;
            } else if (bottoms[i] != target){
                bottomR++;
            }
        }
        return Math.min(topR, bottomR);
    }
}