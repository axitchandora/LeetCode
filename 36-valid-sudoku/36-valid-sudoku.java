class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        Set<Character>[] countOfEachRow=new HashSet[n];
        Set<Character>[] countOfEachColumn=new HashSet[n];
        Set<Character>[] countOfEachBox=new HashSet[n];
        for(int i=0;i<9;i++){
            countOfEachRow[i]=new HashSet<>();
            countOfEachColumn[i]=new HashSet<>();
            countOfEachBox[i]=new HashSet<>();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // Check if the position is filled with number
                char ch=board[i][j];
                if(ch!='.'){
                    // Check the row
                    if(countOfEachRow[i].contains(ch)) return false;
                    countOfEachRow[i].add(ch);
                    
                    // Check the column
                    if(countOfEachColumn[j].contains(ch)) return false;
                    countOfEachColumn[j].add(ch);
                    
                    // Check the Box
                    int cur_Box_Idx=3*(i/3)+(j/3);
                    if(countOfEachBox[cur_Box_Idx].contains(ch)) return false;
                    countOfEachBox[cur_Box_Idx].add(ch);
                }
            }
        }
        return true;
        // Time Compexity - O(N^2)
        // Space Complexity - O(N)
    }
}