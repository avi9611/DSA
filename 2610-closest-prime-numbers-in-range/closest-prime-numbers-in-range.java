class Solution {
    public int[] closestPrimes(int left, int right) {
        // Step 1: Generate all prime numbers up to 10^6 using Sieve of Eratosthenes
        boolean[] isPrime = sieve(1000000);

        // Step 2: Collect primes in the given range [left, right]
        List<Integer> primes = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }

        // Step 3: Find the closest prime pair
        if(primes.size() < 2) return new int[]{-1, -1};

        int minDiff = Integer.MAX_VALUE;
        int num1 = -1, num2 = -1;

        for(int i = 1; i < primes.size(); i++){
            int diff = primes.get(i) - primes.get(i - 1);
            if(diff < minDiff){
                minDiff = diff;
                num1 = primes.get(i - 1);
                num2 = primes.get(i);
            }
        }
        return new int[]{num1, num2};
    }

    // Helper function to compute prime numbers using Sieve of Eratosthenes
    private boolean[] sieve(int n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i * i <= n; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}