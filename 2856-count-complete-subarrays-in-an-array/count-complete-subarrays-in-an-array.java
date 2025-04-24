class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        
        // Count total distinct elements in the array
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int totalDist = set.size();

        int cnt = 0;

        // For every subarray, count distinct and compare
        for(int i = 0; i < n; i++){
            Set<Integer> dist = new HashSet<>();
            for(int j = i; j < n; j++){
                dist.add(nums[j]);
                if(dist.size() == totalDist){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}