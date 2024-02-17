class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
        PriorityQueue<Integer> p = new PriorityQueue<>((a, b_) -> b_ - a);
        
        int i = 0, diff = 0;
        for (i = 0; i < h.length - 1; i++) {
            diff = h[i + 1] - h[i];
            
            if (diff <= 0) {
                continue;
            }

            b -= diff;
            p.offer(diff);

            if (b < 0) {
                b += p.poll();
                l--;
            }

            if (l < 0) {
                break;
            }
        }
        
        return i;
    }
}
