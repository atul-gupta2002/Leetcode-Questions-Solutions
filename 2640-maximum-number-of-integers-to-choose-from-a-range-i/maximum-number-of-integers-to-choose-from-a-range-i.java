class Solution {

    public int maxCount(int[] banned, int n, int maxSum) {

        // Create a lookup array for banned numbers
        int[] bannedArr = new int[10001];
        for (int ban : banned) {
            bannedArr[ban] = 1; // Mark banned numbers
        }

        // Initialize counters
        int count = 0;
        int sum = 0;

        // Iterate through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Check if the current number is banned
            if (bannedArr[i] == 1) 
            {
                continue;
            }

            // Check if adding the current number exceeds maxSum
            if (sum + i > maxSum) {
                break;
            }

            // Add the current number to the selection
            count++;
            sum += i;
        }

        // Return the maximum count of valid numbers
        return count;
    }
}