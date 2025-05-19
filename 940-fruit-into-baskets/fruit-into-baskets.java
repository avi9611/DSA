class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int maxCnt = 0;
        int left = 0;
        
        for(int right = 0; right < fruits.length; right++){
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);

            while(cnt.size() > 2){
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                if(cnt.get(fruits[left]) == 0){
                    cnt.remove(fruits[left]);
                }
                left++;
            }
            maxCnt = Math.max(maxCnt, right - left + 1);
        }
        return maxCnt;
    }
}