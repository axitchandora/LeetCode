class Solution {
    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    int[][] dirs={{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {        
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1 || grid[m-1][n-1]==1)return -1;
        if(m==1 && n==1){
            if(grid[0][0]==0)return 1;
        }
        boolean[][] visited=new boolean[m][n];
        LinkedList<Pair> queue=new LinkedList<Pair>();
        queue.add(new Pair(0,0));
        visited[0][0]=true;
        int level=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            level++;
            while(size-- >0){
                Pair pair=queue.poll();                
                for(int k=0;k<dirs.length;k++){
                    int xDash=pair.x+dirs[k][0];
                    int yDash=pair.y+dirs[k][1];                    
                    if(xDash<0 || xDash>=m || yDash<0 || yDash>=n || grid[xDash][yDash]==1 
                       || visited[xDash][yDash])continue;
                    if(xDash==m-1 && yDash==n-1)return level;
                    queue.add(new Pair(xDash,yDash));
                    visited[xDash][yDash]=true;
                }
            }            
        }
        return -1;
    }
}