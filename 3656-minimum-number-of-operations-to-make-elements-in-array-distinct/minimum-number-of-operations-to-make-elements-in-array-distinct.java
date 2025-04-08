import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int minOps = n / 3 + 1;  
        for (int ops = 0; ops <= n / 3 + 1; ops++) {
            int start = Math.min(n, ops * 3);
            Set<Integer> set = new HashSet<>();
            boolean isDistinct = true;
            
            for (int i = start; i < n; i++) {
                if (!set.add(nums[i])) {
                    isDistinct = false;
                    break;
                }
            }
            
            if (isDistinct) {
                minOps = ops;
                break;
            }
        }
        return minOps;
    }
}
