class MedianFinder {
    PriorityQueue<Integer> minpq;
    PriorityQueue<Integer> maxpq;

    public MedianFinder() {
        minpq= new PriorityQueue<>();
        maxpq= new PriorityQueue<>(Collections.reverseOrder());    
    }
    
    public void addNum(int num) {
        if(minpq.size() == maxpq.size()){
            maxpq.add(num);
            minpq.add(maxpq.poll());
        }
        else{
            minpq.add(num);
            maxpq.add(minpq.poll());    
        }
        
    }
    
    public double findMedian() {
        if(minpq.size()==maxpq.size()){
            return ((minpq.peek())+maxpq.peek())/2.0;
        }
        else{
            return 1*minpq.peek();
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */