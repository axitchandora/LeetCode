class Solution {
    private boolean isValid(char[][] board, int row, int col, char num){
        
        int r,c;
        for(int k=0;k<9;k++){
            r=(row/3)*3+k/3;
            c=(col/3)*3+k%3;
            
            if(row == r && col == c) continue;
            
            if(board[row][k]==num && k!=col)
                return true;
            
            if(board[k][col]==num && k!=row)
                return true;
            
            if(board[r][c]==num)
                return true;            
        }
        return false;
    }
    
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(board[row][col]!='.'){
                    if(isValid(board,row,col,board[row][col]))
                        return false;
                }
            }
        }
        return true;
    }
}