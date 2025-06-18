class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n =  nums.length;
        List<int[]> res = new ArrayList<>();

        for(int i = 0; i < n; i += 3){
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if(c - a > k){
                return new int[0][];
            }
            res.add(new int[]{a, b, c});
        }
        return res.toArray(new int[res.size()][]);
    }
}