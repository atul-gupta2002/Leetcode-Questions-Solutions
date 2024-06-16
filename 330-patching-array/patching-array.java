class Solution {
    public int minPatches(int[] nums, int n) {
        long sumformed=0;
        long expectedSum=1;
        int minPatches=0;
        int i=0;
        int m=nums.length;

        while(sumformed<n){
            if(sumformed>=expectedSum){
                expectedSum=sumformed+1;
            }
            else{
                if(i<m && nums[i]<=expectedSum){
                    sumformed+=nums[i];
                    i++;
                }
                else{
                    minPatches++;
                    sumformed+=expectedSum;
                }
            }
        }
        return minPatches;
    }
}



        
    
