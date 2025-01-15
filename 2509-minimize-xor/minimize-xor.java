class Solution {
    public int minimizeXor(int num1, int num2) {
        int num1Count = Integer.bitCount(num1);
        int num2Count = Integer.bitCount(num2);
        
        while (num1Count < num2Count) {
            num1 |= num1 + 1;
            num1Count++;
        }
        
        while (num1Count > num2Count) {
            num1 &= num1 - 1;
            num1Count--;
        }
        
        return num1;
    }
}