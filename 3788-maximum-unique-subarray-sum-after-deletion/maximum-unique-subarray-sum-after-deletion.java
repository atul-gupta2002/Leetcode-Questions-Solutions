class Solution {
    public int maxSum(int[] nums) {
      Set<Integer> set = new HashSet<>();
      int result=0;
      int negativeValues = Integer.MIN_VALUE;
      for(int num : nums){
        if(num>0){
            set.add(num);
        }
        else{
            negativeValues = Math.max(negativeValues,num);
        }
      }

      for(int num:set){
        result+=num;
      }

      return result==0 ? negativeValues : result;
        
    }
}