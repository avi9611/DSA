class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = nextN(n);

        while(fast != 1 && slow != fast){
            slow = nextN(slow);
            fast = nextN(nextN(fast));
        }
        return fast == 1;
    }
    private int nextN(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}