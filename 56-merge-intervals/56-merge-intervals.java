class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        LinkedList<int []> mergeIntervals=new LinkedList();
        for(int[] interval:intervals){
            if(mergeIntervals.isEmpty() || mergeIntervals.getLast()[1]<interval[0]){
                mergeIntervals.add(interval);
            }else{
                mergeIntervals.getLast()[1]=Math.max(mergeIntervals.getLast()[1],interval[1]);
            }
        }
        return mergeIntervals.toArray(new int[mergeIntervals.size()][]);
    }
}