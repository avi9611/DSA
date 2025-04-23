class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxS = 0;

        for(int i = 1; i <= n; i++){
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            maxS = Math.max(maxS, map.get(sum));
        }

        int cnt = 0;
        for(int freq: map.values()){
            if(freq == maxS){
                cnt++;
            }
        }
        return cnt;
    }

    private int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}