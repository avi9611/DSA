class Solution {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        while(left <= right){
            long mid = left + (right - left) / 2;
            long coin = mid * (mid + 1) / 2;

            if(coin == n){
                return (int) mid;
            } else if (coin < n){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}