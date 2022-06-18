class Solution {
    // To Store First Half Of Sub-Array
    //private PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder()); 
    private PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->Integer.compare(b,a)); 
    // To Store Second Half Of Sub-Array
    private PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result=new double[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            if(maxHeap.isEmpty() || maxHeap.peek()>=nums[i])
                maxHeap.offer(nums[i]);
            else
                minHeap.offer(nums[i]);
            
            rebalanceHeaps();
            
            if(i-k+1>=0){ // if we have at least 'k' elements in the sliding window
                 // add the median to the the result array
                if(maxHeap.size()==minHeap.size())
                    // we have even number of elements, take the average of middle two elements
                    result[i-k+1]=maxHeap.peek()/2.0 + minHeap.peek()/2.0;
                else // because max-heap will have one more element than the min-heap
                    result[i-k+1]=maxHeap.peek();
                
                // remove the element going out of the sliding window
                int elementToRemove=nums[i-k+1];
                if(maxHeap.peek()>=elementToRemove)
                    maxHeap.remove(elementToRemove);
                else
                    minHeap.remove(elementToRemove);
                rebalanceHeaps();
            }
        }
        return result;
    }
    
    private void rebalanceHeaps(){
        // either both the heaps will have equal number of elements or max-heap will have 
        // one more element than the min-heap
        if(maxHeap.size()>minHeap.size()+1)
            minHeap.offer(maxHeap.poll());
        else if(maxHeap.size()<minHeap.size())
            maxHeap.offer(minHeap.poll());
    }
}