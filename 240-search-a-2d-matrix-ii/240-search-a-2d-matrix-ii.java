class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0,column=matrix[0].length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target) return true;
            else if(matrix[row][column]<target) row++;
            else column--;
        }
        return false;
    }
}