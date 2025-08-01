class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i =1;i<= numRows;i++){
            result.add(generateRows(i));
        }
        return result;
    }

    public List<Integer> generateRows(int numRows){
        int ans = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1;i<numRows;i++){
            ans=ans*(numRows-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;

    }
}