class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Valid combination
            return;
        }

        if (target < 0 || index == candidates.length) {
            return; // Exceeded target or out of bounds
        }

        // Include the current number
        current.add(candidates[index]);
        backtrack(candidates, index, target - candidates[index], current, result);
        current.remove(current.size() - 1); // backtrack

        // Exclude the current number and move to next
        backtrack(candidates, index + 1, target, current, result);
    }
}
