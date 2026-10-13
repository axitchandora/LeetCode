class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> Freqmap = new HashMap<>();
        for(int num:nums){
            Freqmap.put(num, Freqmap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (m1,m2)-> Integer.compare(m2.getValue(),m1.getValue())
        );
        for(Map.Entry<Integer,Integer> entry: Freqmap.entrySet()){
            maxHeap.offer(entry);
        }
        int[] result=new int[k];
        int i=0;
        while(i<k){
            result[i]=maxHeap.poll().getKey();
            i++;
        }
        return result;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna