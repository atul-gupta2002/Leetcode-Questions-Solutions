class Solution {
    public boolean isPrime(int val) {
        if (val < 2) return false;
        for (int i = 2; i * i <= val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int nonSpecialCount(int l, int r) {
        int cnt = 0;
        for (int i = 2; i * i <= r; i++) {
            if (isPrime(i)) {
                int sq = i * i;
                if (sq >= l && sq <= r) cnt++;
            }
        }
        return (r - l + 1) - cnt;
    }
}