class Solution {
    public long pickGifts(int[] gifts, int k) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
       for(int val : gifts){
        maxHeap.add(val);
       }
       for(int i=0;i < k && maxHeap.peek() > 1;i++){
        int sq = maxHeap.poll();
        maxHeap.add((int) Math.sqrt(sq));
       }

       long sum = 0;
       for(int val : maxHeap){
        sum+=val;
       }

       return sum;
        
    }
}