class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int left=0,top=0;
        int right=n-1,bottom=n-1;
        int k=1;
        while(left<=right && top<=bottom){
            // Traversing from Left to Right
            for(int i=left;i<=right;i++){
                result[top][i]=k;
                k++;
            }            
            top++;
            // Traversing from Top to Bottom 
            for(int i=top;i<=bottom;i++){
                result[i][right]=k;
                k++;
            }            
            right--;
            // Traversing from Right to Left
            for(int i=right;i>=left;i--){
                result[bottom][i]=k;
                k++;
            }            
            bottom--;
            // Traversing from Bottom to Top
            for(int i=bottom;i>=top;i--){
                result[i][left]=k;
                k++;
            }            
            left++;
            
        }
        return result;
        // Time Complexity - O(N^2)
        // Space Complexity - O(1)
    }
}