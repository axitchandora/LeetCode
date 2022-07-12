class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<Integer>[] adjList=new ArrayList[n];
        for(int i=0;i<n;i++){
            adjList[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<n;i++){
            if(manager[i]!=-1)
                adjList[manager[i]].add(i);
        }
        int maxTime=0;
        ArrayDeque<int []> queue=new ArrayDeque<>();
        queue.add(new int[]{headID,0});
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-- >0){                
                int[] v=queue.poll();
                maxTime=Math.max(maxTime,v[1]);
                for(int nbr:adjList[v[0]]){                  
                    queue.add(new int[]{nbr,v[1]+informTime[v[0]]});
                }                
            }
        }
        return maxTime;
    }
}