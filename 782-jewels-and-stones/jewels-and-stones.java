class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        for(char c: jewels.toCharArray()){
            jewelSet.add(c);
        }

        int cnt = 0;
        for(char s: stones.toCharArray()){
            if(jewelSet.contains(s)){
                cnt++;
            }
        }
        return cnt;
    }
}