class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum1=0;
        long sum2=0;
        int split=0;
        for (int num : nums){
            sum2+=num;
        }
        for(int i=0;i<nums.length-1;i++){
            sum1 +=nums[i];
               sum2 -=nums[i];
           
        
        if(sum1>=sum2){
            split++;
        }
        }
       
        return split;
    }
}

