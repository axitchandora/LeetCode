class Solution {
    public int diagonalSum(int[][] mat) {
        int diagonalSum=0;
        for(int i=0;i<mat.length;i++){
            if(i!=mat.length-i-1)
                diagonalSum+=(mat[i][i]+mat[i][mat.length-i-1]);
            else
                diagonalSum+=mat[i][i];
        }
        return diagonalSum;
    }
}