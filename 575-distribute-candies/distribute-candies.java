class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : candyType){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        int n = candyType.length;
        int count = map.size();

        return count >( n / 2) ? n / 2 : count;
        
    }
}