class Solution {
    public void solve(char[][] board) {
        if(board==null || board.length==0)return;
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O') dfs(board,i,0,'A');
            if(board[i][n-1]=='O') dfs(board,i,n-1,'A');
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O') dfs(board,0,j,'A');
            if(board[m-1][j]=='O') dfs(board,m-1,j,'A');
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')
                   board[i][j]='X'; 
                else if(board[i][j]=='A')
                    board[i][j]='O';                    
            }
        }       
    }
    private void dfs(char[][] board,int i,int j,char newchar){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='X' || board[i][j]=='A')
            return;
        
        board[i][j]=newchar;
        dfs(board,i-1,j,newchar);
        dfs(board,i,j+1,newchar);
        dfs(board,i,j-1,newchar);
        dfs(board,i+1,j,newchar);        
    }
}