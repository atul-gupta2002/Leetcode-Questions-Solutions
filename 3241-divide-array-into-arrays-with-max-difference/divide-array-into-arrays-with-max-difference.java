class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int length = nums.length;
        int[][] result = new int[length/3][3];
        Arrays.sort(nums);
        for(int i=0,m=0; i<length;i+=3,m++){
            result[m][0]=nums[i];
            for(int j=0;j<3;j++){
                if(nums[i+j]-result[m][0]<=k){
                    result[m][j] = nums[i+j];
                }else{
                    return new int[0][0];
                }
            }
        }
       return result;  
    }
   
}