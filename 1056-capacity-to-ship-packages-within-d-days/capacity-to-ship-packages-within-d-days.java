class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for(int weight: weights){
            left = Math.max(left, weight);
            right += weight;
        }

        // binary search
        while(left < right){
            int mid = (left + right) >> 1;

            if(canShip(weights, mid, days)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canShip(int[] weights, int capacity, int days){
        int currentLoad = 0;
        int requiredDays = 1;

        for(int weight: weights){
            currentLoad += weight;
            if(currentLoad > capacity){
                currentLoad = weight;
                requiredDays++;
            }
        }
        return requiredDays <= days;
    }
}