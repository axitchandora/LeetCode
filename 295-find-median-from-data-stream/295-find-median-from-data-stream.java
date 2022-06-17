class MedianFinder {
    private PriorityQueue<Integer> maxHeap; //containing first half of numbers
    private PriorityQueue<Integer> minHeap; //containing second half of numbers
    public MedianFinder() {
    maxHeap = new PriorityQueue<>((a, b) -> b - a);
    minHeap = new PriorityQueue<>((a, b) -> a - b);
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek() >= num)
            maxHeap.offer(num);
        else
            minHeap.offer(num);
        
        // either both the heaps will have equal number of elements or max-heap will have one 
        // more element than the min-heap
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        }else if(maxHeap.size()<minHeap.size())
            maxHeap.offer(minHeap.poll());
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            // we have even number of elements, take the average of middle two elements
            return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        }
        // because max-heap will have one more element than the min-heap
        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */