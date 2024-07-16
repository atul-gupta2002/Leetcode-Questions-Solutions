// Kadane's Algorithm

class Solution {
    public int maxSubArray(int[] arr) {
        int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
        
    }
}