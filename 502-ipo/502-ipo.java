class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        PriorityQueue<Integer> minCapitalHeap=new PriorityQueue<>(n,(i1,i2)->Integer.compare(capital[i1],capital[i2]));
        PriorityQueue<Integer> maxProfitHeap=new PriorityQueue<>(n,(i1,i2)->Integer.compare(profits[i2],profits[i1]));
        
        // insert all project capitals to a min-heap
        for(int i=0;i<n;i++)
            minCapitalHeap.offer(i);
        // let's try to find a total of 'numberOfProjects' best projects  
        for(int i=0;i<k;i++){
            // find all projects that can be selected within the available capital and insert them in a max-heap            
            while(!minCapitalHeap.isEmpty() && capital[minCapitalHeap.peek()]<=w)
                maxProfitHeap.offer(minCapitalHeap.poll());
            
            // terminate if we are not able to find any project that can be completed within the available capital             
            if(maxProfitHeap.isEmpty())
                break;
            
            // select the project with the maximum profit
            w+=profits[maxProfitHeap.poll()];
            
        }
        return w;
    }
}