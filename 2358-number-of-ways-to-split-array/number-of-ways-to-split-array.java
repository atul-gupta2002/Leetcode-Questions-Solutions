// class Solution {
//     public int waysToSplitArray(int[] nums) {
//         int sum1=0;
//         int sum2=0;
//         int split=0;
//         for(int i=0;i<nums.length;i++){
//             sum2+=nums[i];
//         }
//         for(int i=0;i<nums.length-1;i++){
//             sum1 +=nums[i];
           
        
//         if(sum1>=sum2-sum1){
//             split++;
//         }
//         }
       
//         return split;
//     }
// }

class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int validSplits = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum >= rightSum) {
                validSplits++;
            }
        }

        return validSplits;
    }
}