class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        PriorityQueue<Double> heap = new PriorityQueue();
        for (int i = 0; i < dist.length; i++) {
            heap.add ((double) dist[i] / speed[i]);
        }
        
        int ans = 0;
        while (!heap.isEmpty()) {
            if (heap.remove() <= ans) {
                break;
            }
            
            ans++;
        }
        
        return ans;
    }
}