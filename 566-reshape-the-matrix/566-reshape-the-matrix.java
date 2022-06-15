class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m==0 || r*c!=m*n)
            return mat;
        int cur_row=0,cur_col=0;
        int result[][]=new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[cur_row][cur_col++]=mat[i][j];
                if(cur_col==c) {cur_col=0;cur_row++;}
                if(cur_row==r) break;
            }
        }
        return result;
    }
}