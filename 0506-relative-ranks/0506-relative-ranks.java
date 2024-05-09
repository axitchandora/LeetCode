class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] result=new String[n];
        Queue<Pair<Integer, Integer>> heap = new PriorityQueue<>((a,b)->b.getKey()-a.getKey());
        for(int i=0;i<n;i++)
            heap.add(new Pair(score[i],i));
        int place = 1;
        while(!heap.isEmpty()){
            Pair<Integer, Integer> pair= heap.poll();
            if(place == 1)
                result[pair.getValue()]=new String("Gold Medal");
            else if(place == 2)
                result[pair.getValue()]=new String("Silver Medal");
            else if(place == 3)
                result[pair.getValue()]=new String("Bronze Medal");
            else
                result[pair.getValue()]=String.valueOf(place);
            place += 1 ;           
        }
        return result;
    }
}