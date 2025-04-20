class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int ans: answers){
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        for(int k: map.keySet()){
            int cnt = map.get(k);
            int grpSize = k + 1;

            int grps = (cnt + grpSize - 1) / grpSize;
            sum += grps * grpSize;
        }
        return sum;
    }
}