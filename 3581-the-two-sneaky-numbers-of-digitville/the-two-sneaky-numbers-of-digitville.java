class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> dup = new ArrayList<>();
        for(int num: nums){
            if(seen.contains(num)){
                dup.add(num);
            }else{
                seen.add(num);
            }
        }
        return new int[]{dup.get(0), dup.get(1)};
    }
}