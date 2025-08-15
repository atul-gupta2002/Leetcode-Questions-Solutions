class Solution {
    public boolean isPowerOfFour(int n) {
        // Check positive, power of 2, and correct position of '1' bit
        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }
}
