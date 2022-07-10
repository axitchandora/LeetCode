class Solution {
    private int [][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
    
    static class Pair{
        int x,y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    
    public int maxDistance(int[][] grid) {
        ArrayDeque<Pair> queue=new ArrayDeque<Pair>();
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    queue.add(new Pair(i,j));
            }
        }
        if(queue.size()==0 || queue.size()==m*n) return -1;
        int level=-1;
        while(!queue.isEmpty()){
            int size=queue.size();
            level++;
            while(size-- >0){
                Pair rem=queue.poll();
                for(int i=0;i<dirs.length;i++){
                    int xDash=rem.x+dirs[i][0];
                    int yDash=rem.y+dirs[i][1];
                    if(xDash<0 || xDash>=m || yDash<0 || yDash>=n || grid[xDash][yDash]==1) continue;
                    
                    grid[xDash][yDash]=1;
                    queue.add(new Pair(xDash,yDash));
                }
          }
        }
        return level;
        
    }
}