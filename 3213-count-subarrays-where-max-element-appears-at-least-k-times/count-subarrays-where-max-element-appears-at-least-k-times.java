class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int maxi = 0;
        for(int num: nums){
            maxi = Math.max(maxi, num);
        }

        long ans = 0;
        int left = 0;
        int cnt = 0;
        for(int right = 0; right < n; right++){
            if(nums[right] == maxi){
                cnt++;
            }

            while(cnt >= k){
                if(nums[left] == maxi){
                    cnt--;
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }
}