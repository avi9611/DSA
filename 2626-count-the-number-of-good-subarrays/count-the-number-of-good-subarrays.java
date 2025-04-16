class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        long ans = 0;
        long pairs = 0;
        int left = 0;

        for(int right = 0; right < n; right++){
            int curr = nums[right];
            // Add current element and update pairs
            int cnt = freq.getOrDefault(curr, 0);
            // add count number of new pairs
            pairs += cnt;
            freq.put(curr, cnt + 1);

            // Shrink from the left if pairs >= k
            while(pairs >= k){
                // All subarrays from left to n that start at `left` are valid
                ans += (n - right);
                int leftNum = nums[left];
                int cntLeft = freq.get(leftNum);
                freq.put(leftNum, cntLeft - 1);
                // Remove
                pairs -= (cntLeft - 1);
                left++;
            }
        }
        return ans;
    }
}