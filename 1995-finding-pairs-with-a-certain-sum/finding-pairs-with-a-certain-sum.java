class FindSumPairs {
    int[] nums1;
    int[] nums2;
    Map<Integer, Integer> freqMap;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        freqMap = new HashMap<>();
        for(int num: nums2){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];
        freqMap.put(oldVal, freqMap.get(oldVal) -1);
        if(freqMap.get(oldVal) == 0){
            freqMap.remove(oldVal);
        }
        nums2[index] += val;
        int newVal = nums2[index];
        freqMap.put(newVal, freqMap.getOrDefault(newVal, 0) + 1);
    }
    
    public int count(int tot) {
        int cnt = 0;
        for(int num1: nums1){
            int comp = tot - num1;
            cnt += freqMap.getOrDefault(comp, 0);
        }
        return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */