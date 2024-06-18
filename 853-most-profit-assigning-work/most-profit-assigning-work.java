class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum=0;
        for(int i=0;i<worker.length;i++){
            int p=0,mp=0;
            for(int j=0;j<difficulty.length;j++){
                if(difficulty[j]<=worker[i]){
                    p=profit[j];
                    if(mp<p){
                        mp=p;
                    }
                }
            }
            sum+=mp;
        }
        return sum;
    }
}