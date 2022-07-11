class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected==null || isConnected.length==0) return 0;
        int n=isConnected.length;
        int provinces=0;
        for(int i=0;i<n;i++){
            if(isConnected[i][i]==1){
                provinces++;
                dfs(isConnected,i);
            }
        }
        return provinces;
    }
    private void dfs(int[][] isConnected,int src){
        isConnected[src][src]=0;
        for(int j=0;j<isConnected[0].length;j++){
            if(isConnected[src][j]==1){
                isConnected[src][j]=0;
                if(isConnected[j][j]==1){
                    dfs(isConnected,j);
                }
            }
        }
    }
    
}