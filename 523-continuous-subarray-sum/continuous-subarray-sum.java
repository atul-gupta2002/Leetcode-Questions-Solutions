class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int [] ans=new int[nums.length];
         ans[0]=nums[0];
         for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
         }
        Map<Integer,Integer> a=new HashMap<>();
        a.put(0,-1);
         for(int i=0;i<ans.length;i++){
            if(a.containsKey(ans[i] % k)){
                if(i-a.get(ans[i] % k) >=2) return true;
            }
            else a.put(ans[i]% k ,i);
         }
         return false;
    }
}