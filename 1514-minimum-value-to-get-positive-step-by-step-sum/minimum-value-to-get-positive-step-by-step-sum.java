class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int startValue = 0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            startValue=Math.min(startValue,sum);
        }
        return -startValue+1;   
    }
}