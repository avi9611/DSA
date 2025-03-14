class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 0;
        int right = Arrays.stream(candies).max().getAsInt();

        // binary search to find the maximum number of candies 
        // that can be distributed to `k` childrens equally.
        while(left < right){
            int mid = (left + right + 1) >> 1;

            // Count how many children can receive at least mid candies.
            long cnt = 0;
            for(int candy: candies){
                cnt += candy / mid;
            }

            if(cnt >= k){
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}