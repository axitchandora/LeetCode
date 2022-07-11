class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result=new ArrayList<>();
        if(heights==null || heights.length==0 || heights[0].length==0) return result;
        int rows=heights.length, cols=heights[0].length;
        boolean[][] pacific=new boolean [rows][cols];
        boolean[][] atlantic=new boolean [rows][cols];
        
        // Apply DFS 
        for(int i=0;i<cols;i++){
            dfs(heights,0,i,Integer.MIN_VALUE,pacific);
            dfs(heights,rows-1,i,Integer.MIN_VALUE,atlantic);
        }
        
        for(int i=0;i<rows;i++){
            dfs(heights,i,0,Integer.MIN_VALUE,pacific);
            dfs(heights,i,cols-1,Integer.MIN_VALUE,atlantic);
        }
        
        // Finding common cells
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pacific[i][j]&&atlantic[i][j])
                    result.add(Arrays.asList(i,j));
            }
        }
        return result;
    }
    private int [][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
    private void dfs(int[][] heights,int i,int j,int prev,boolean[][] ocean){
        if(i<0 || j<0 || i>=heights.length || j>=heights[0].length) return;
        if(heights[i][j]<prev || ocean[i][j])return;
        ocean[i][j]=true;
        for(int k=0;k<dirs.length;k++){
            dfs(heights,i+dirs[k][0],j+dirs[k][1],heights[i][j],ocean);
        }
    }
    // Time Complexity - O(M*N)
    // Sapce Complexity - O(M*N)
}