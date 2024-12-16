import java.util.Arrays;
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        for (int i = 0; i < k; i++) {
            int minIndex = 0;

            // Find the minimum value and its first occurrence
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Replace the minimum value with its multiplied value
            nums[minIndex] *= multiplier;
        }

        return nums;    
    }
}