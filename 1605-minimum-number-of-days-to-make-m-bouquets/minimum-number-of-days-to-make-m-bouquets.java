class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        // Not enough flowers to make m bouquets
        if((long) m * k > n) return -1;

        // find the min and max days
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for(int day: bloomDay){
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        // perform binary search to find minimum days
        while(low < high){
            int mid = (low + high) >>> 1;
            if(canMakeBouquets(bloomDay, m, k, mid)){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // helper method to find if it is possible to make required amount of bouquets
    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int days){
        int bouquets = 0, flowers = 0;
        for(int day: bloomDay){
            if(day <= days){
                // Flower is bloomed
                flowers++;
                if(flowers == k){
                    bouquets++;
                    // Reset
                    flowers = 0;
                    // Found enough bouquets
                    if(bouquets == m) return true;
                }
            } else {
                // Reset count if a gap appears
                flowers = 0;
            }
        }
        // Not enough bouquets
        return false;
    }
}