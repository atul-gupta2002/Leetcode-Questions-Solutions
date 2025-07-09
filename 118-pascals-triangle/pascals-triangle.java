class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }

    public List<Integer> generateRow(int rowNo){
        int ans=1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1;i<rowNo;i++){
            ans=ans*(rowNo-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
}
    }
    