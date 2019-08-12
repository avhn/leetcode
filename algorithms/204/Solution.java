class Solution {

    /**
     * With Sieve of Eratosthenes.
     * For maximum of n numbers, we run outer loop n times and validate
     * primes total of sum(n/2, n/3, n/4, ..., n/n-1) times.
     * This is a related to harmonic series, thus equals n*log(log(n)).
     *
     * Time complexity: O(n log log n)
     * Space complexity: O(n)
     */
    public int countPrimes(int n) {
        if (n < 3) return 0;

        boolean[] notPrime = new boolean[n];
        int c = n - 2;    // 1 and n not included
        double sqrtN = Math.sqrt(n);
        for (int i = 2; i < sqrtN; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    if (!notPrime[j]) {
                        notPrime[j] = true;
                        c--;
                    }
                }
            }
        }
        return c;
    }
}
