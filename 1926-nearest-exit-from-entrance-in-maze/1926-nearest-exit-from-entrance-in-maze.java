class Solution {
    private static int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows=maze.length;
        int cols=maze[0].length;
        LinkedList<Pair> queue=new LinkedList<>();
        queue.add(new Pair(entrance[0],entrance[1]));
        maze[entrance[0]][entrance[1]]='+';
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-- >0){
                Pair rem=queue.removeFirst();
                for(int i=0;i<dirs.length;i++){
                    int xDash=rem.x+dirs[i][0];
                    int yDash=rem.y+dirs[i][1];
                    
                    if(xDash<0 || yDash<0 || xDash>=rows || yDash>=cols
                       || maze[xDash][yDash]=='+') continue;
                    
                    if(xDash*yDash==0 || xDash==rows-1 || yDash==cols-1) return level+1;
                    maze[xDash][yDash]='+';
                    queue.add(new Pair(xDash,yDash));                    
                }                
            }
            level++;
        }
        return -1;
    }
}