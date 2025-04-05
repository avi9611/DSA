class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int currX){
        if(index == nums.length){
            return currX;
        }

        int include = dfs(nums, index + 1, currX ^ nums[index]);

        int exclude = dfs(nums, index + 1, currX);

        return include + exclude;
    }
}