class Solution {
    public int countPrimeSetBits(int left, int right) {
        HashSet<Integer> primes = new HashSet<>(
            // Prime numbers up to 20
            Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)
        );

        int cnt = 0;

        for(int num = left; num <= right; num++){
            int setBits = Integer.bitCount(num);
            if(primes.contains(setBits)){
                cnt++;
            }
        }
        return cnt;
    }
}