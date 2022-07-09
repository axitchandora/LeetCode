class Solution {
    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    private static int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        LinkedList<Pair> queue=new LinkedList();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                if(mat[i][j]==0){
                    queue.add(new Pair(i,j));
                }else{
                    mat[i][j]=-1;
                }
                    
        }        
        while(queue.size()>0){
            Pair pair=queue.poll();
            
            for(int i=0;i<4;i++){
                int xdash=pair.x+dirs[i][0];
                int ydash=pair.y+dirs[i][1];
                
                if(xdash>= 0 && xdash<m && ydash>=0 && ydash<n && mat[xdash][ydash]==-1){
                    mat[xdash][ydash]=mat[pair.x][pair.y]+1;
                    queue.add(new Pair(xdash,ydash));
                }
            }
        }
        return mat;
    }
    // Time Complexity - O(V+E)
    // Space Complexity - O(V)
}