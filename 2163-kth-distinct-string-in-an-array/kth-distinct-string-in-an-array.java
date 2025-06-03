class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freqMap = new HashMap<>();

        for(String str: arr){
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        int cnt = 0;
        for(String str: arr){
            if(freqMap.get(str) == 1){
                cnt++;
                if(cnt == k){
                    return str;
                }
            }
        }
        return "";
    }
}