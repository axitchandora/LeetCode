class Solution {
    class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited=new boolean[n];
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            graph[edge[0]].add(new Edge(edge[0],edge[1]));
            graph[edge[1]].add(new Edge(edge[1],edge[0]));
        }
        return hasPath(graph,source,destination,visited);
    }
    private boolean hasPath(ArrayList<Edge>[] graph, int source, int destination,boolean[] visited){
        if(source==destination) return true;
        visited[source]=true;
        for(Edge edge:graph[source])
            if(!visited[edge.nbr]){
                boolean hashNbrPath=hasPath(graph,edge.nbr,destination,visited);
                if(hashNbrPath) return true;
            }    
        return false;
    }
}