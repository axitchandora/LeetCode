class Solution {
    public int numSpecial(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int[] rmat=new int[r];
        int[] cmat=new int[c];
        int result=0;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    rmat[i]++;
                    cmat[j]++;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1 && rmat[i]==1 && cmat[j]==1){
                    result++;
                }
            }
        }
        return result;        
    }
}