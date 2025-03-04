class Solution {
    public boolean checkPowersOfThree(int n) {
        while( n > 0){
            //If any digit in base-3 representation is 2, it's not possible
            if(n % 3 == 2){
                return false;
            }
            n /= 3;
        }
        //If we never encountered a 2, it can be represented as distinct powers of 3
        return true;
    }
}