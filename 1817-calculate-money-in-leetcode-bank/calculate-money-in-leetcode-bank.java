class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int total = 0;
        for(int i = 0; i < weeks; i++){
            int start = 1 + i;
            total += (start + (start + 6)) * 7 / 2;
        }
        int start = 1 + weeks;
        for(int i = 0; i < days; i++){
            total += start + i;
        }
        return total;
    }
}