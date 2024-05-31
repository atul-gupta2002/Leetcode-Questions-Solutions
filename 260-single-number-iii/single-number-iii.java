class Solution {
    public int[] singleNumber(int[] nums) {
        int[] nums1 = new int[2];
        int index=0;
        for(int i=0;i<nums.length;i++){
            boolean found =false;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    found =true;
                    break;
                }
            }
            if(!found){
                nums1[index++]=nums[i];
                if(index==2){
                    break;
                }

            }
        }
        return nums1;
        
    }
}