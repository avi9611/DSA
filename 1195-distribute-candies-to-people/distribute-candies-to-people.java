class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int give = 1;
        int i = 0;
        while(candies > 0){
            int giveCandi = Math.min(give, candies);
            res[i] += giveCandi;
            candies -= giveCandi;
            i = (i + 1) % num_people;
            give++;
        }
        return res;
    }
}