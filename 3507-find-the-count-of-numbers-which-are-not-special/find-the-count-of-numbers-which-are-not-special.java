class Solution {
   public List<Integer> sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public int nonSpecialCount(int l, int r) {
        int sqrtR = (int) Math.sqrt(r);
        List<Integer> primes = sieveOfEratosthenes(sqrtR);
        int cnt = 0;

        for (int prime : primes) {
            int sq = prime * prime;
            if (sq >= l && sq <= r) {
                cnt++;
            }
        }

        return (r - l + 1) - cnt;
    }
}