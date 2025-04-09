import java.util.*;

class Solution {
    public int minOperations(int[] nums, int k) {
        // If any element is less than k, impossible
        for (int num : nums) {
            if (num < k) return -1;
        }

        // Use TreeSet to collect unique values > k in descending order
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : nums) {
            if (num > k) {
                set.add(num);
            }
        }

        return set.size(); 
    }
}
