class Solution {
    static class Pair{
        int v;
        int level;
        public Pair(int v,int level){
            this.v=v;
            this.level=level;
        }
    }
    public boolean isBipartite(int[][] graph) {
        int m=graph.length;
        int[] visited=new int[m];
        Arrays.fill(visited,-1);
        for(int v=0;v<m;v++){
            if(visited[v]==-1){
                boolean isTrue=checkComponentForBipartiteness(graph,v,visited);
                if(!isTrue) return false;
            }
        }    
        return true;
    }
    
    public boolean checkComponentForBipartiteness(int[][] graph,int src,int[] visited){
        ArrayDeque<Pair> queue=new ArrayDeque<>();
        queue.add(new Pair(src,0));
        
        while(queue.size()>0){
            Pair rem=queue.poll();
            
            if(visited[rem.v]!=-1){
                if(rem.level!=visited[rem.v])return false;
            }else{
                visited[rem.v]=rem.level;
            }            
            
            for(int i=0;i<graph[rem.v].length;i++){
                if(visited[graph[rem.v][i]]==-1){
                    queue.add(new Pair(graph[rem.v][i],rem.level+1));
                }
            }
        }
        return true;
    }
}