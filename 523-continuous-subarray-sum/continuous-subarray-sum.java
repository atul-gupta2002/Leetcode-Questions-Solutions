import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // HashMap to store the remainder and the corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize the map with remainder 0 at index -1
        map.put(0, -1);
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            int remainder = runningSum % k;
            
            // Adjust remainder to handle negative values of k
            if (remainder < 0) {
                remainder += k;
            }
            
            if (map.containsKey(remainder)) {
                // Check if the subarray length is at least 2
                if (i - map.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Store the first occurrence of this remainder
                map.put(remainder, i);
            }
        }
        
        return false;
    }
}
