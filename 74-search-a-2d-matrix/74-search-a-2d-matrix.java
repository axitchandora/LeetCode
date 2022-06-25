class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        if(m==0) return false;
        int n=matrix[0].length;
        int left=0, right=m*n-1;
        int row,col;
        while(left<=right){
            int mid=left+(right-left)/2;
            row=mid/n;
            col=mid%n;
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]>target)                
                right=mid-1;
            else
                left=mid+1;
                
        }
        return false;
    }
    //Time Complexity - O(log(mn))
    //Space Complexity - O(1)
}