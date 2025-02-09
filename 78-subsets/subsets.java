class Solution {
   List<List<Integer>> ans = new ArrayList<>();
   int n;
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        n=nums.length;

        Helper(list,nums,0); 

        return ans;  
    }

    public void Helper(List<Integer> list,int[] nums,int startIndex){
        if(startIndex==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[startIndex]);
        Helper(list,nums,startIndex+1);

        list.remove(list.size()-1); //backtrakcing

        Helper(list,nums,startIndex+1);
    }
}