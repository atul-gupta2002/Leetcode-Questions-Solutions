class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum =0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        if(totalSum%2!=0){
            return false;
        }
        int target=totalSum/2;

        boolean[] dp = new boolean[10001];
        dp[0]=true;

        for(int num:nums){
            for(int i=10000;i>=num;i--){
                dp[i]=dp[i] || dp[i-num];
            }
        }
        return dp[target];
        
    }
}