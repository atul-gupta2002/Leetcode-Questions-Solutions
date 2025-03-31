class Solution {
    public int[] minCosts(int[] cost) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int[] res = new int[cost.length];
        for(int i=0;i<cost.length;i++){
            q.offer(cost[i]);
            res[i] = q.peek();
        }
        return res;
    }
}