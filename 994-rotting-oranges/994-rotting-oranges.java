class Solution {
    static class Pair{
        int row,col;
        public Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    private static int dirs[][]={{1,0},{-1,0},{0,1},{0,-1}};
    public int orangesRotting(int[][] grid) {
        ArrayDeque<Pair> queue=new ArrayDeque<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
                    queue.add(new Pair(i,j));
                else if(grid[i][j]==1)
                    fresh++;
            }
        }
        if(fresh==0) return 0;
        int time=-1;
        while(!queue.isEmpty()){
            int size=queue.size();
            time++;
            while(size-- >0){
                Pair pair=queue.poll();
                for(int i=0;i<dirs.length;i++){
                    int rowDash=pair.row+dirs[i][0];
                    int colDash=pair.col+dirs[i][1];
                    
                    if(rowDash>=0 && colDash>=0 &&  rowDash<grid.length && 
                       colDash<grid[0].length &&  grid[rowDash][colDash]==1) {
                    queue.add(new Pair(rowDash,colDash));
                    grid[rowDash][colDash]=0;
                    fresh--;    
                    }
                }
            }
        }
        return fresh==0?time:-1;
    }
}