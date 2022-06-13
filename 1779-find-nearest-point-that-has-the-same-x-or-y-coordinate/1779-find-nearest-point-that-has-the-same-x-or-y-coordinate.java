class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        if(points.length==0)return -1;
        int index=-1;
        int minManhattanDistance=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
             if(points[i][0] == x || points[i][1] == y){
                int curManhattanDistance=findManhattanDistance(x,y,points[i][0],points[i][1]);
                if(curManhattanDistance<minManhattanDistance){
                    minManhattanDistance=curManhattanDistance;
                    index=i;
                }
            }
        }
        return index;
    }
    private int findManhattanDistance(int x1,int y1,int x2,int y2){
        return Math.abs(x1 - x2) + Math.abs(y1 - y2) ;
    }
}