class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> list = new ArrayList<>();
        int n = boxes.length();
        int[] ans = new int[n];

        for(int i=0;i<n ;i++){
            if(boxes.charAt(i)=='1'){
                list.add(i);
            }
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for(int index : list){
                int distance = Math.abs(i - index);
                sum += distance;

            }
            ans[i] = sum;
        }
        return ans;
    }
}