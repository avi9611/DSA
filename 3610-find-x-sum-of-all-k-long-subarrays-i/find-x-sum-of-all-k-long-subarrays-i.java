class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
            Collections.sort(list, (a, b) -> {
                if (!a.getValue().equals(b.getValue()))
                    return b.getValue() - a.getValue();
                return b.getKey() - a.getKey();
            });
            int sum = 0;
            int count = 0;
            for (Map.Entry<Integer, Integer> entry : list) {
                if (count == x) break;
                int num = entry.getKey();
                int occ = entry.getValue();
                sum += num * occ;
                count++;
            }

            answer[i] = sum;
        }
        return answer;
    }
}