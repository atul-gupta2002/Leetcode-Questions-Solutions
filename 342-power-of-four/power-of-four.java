class Solution {
    public boolean isPowerOfFour(int n) {
        for (int i = 0; Math.pow(4, i) <= n; i++) { 
            if (n == Math.pow(4, i)) {
                return true;
            }
        }
        return false;
    }
}
