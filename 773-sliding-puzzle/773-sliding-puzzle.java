class Solution {
    private static String swapIndex(String str,int i,int j){
        StringBuilder sb=new StringBuilder(str);
        sb.setCharAt(i,str.charAt(j));
        sb.setCharAt(j,str.charAt(i));
        return sb.toString();
    }
    
    public int slidingPuzzle(int[][] board) {
        // Using BFS
        String solvedPuzzle="123450";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                sb.append(board[i][j]);
            }
        }
        String initalValue=sb.toString();
        ArrayDeque<String> queue=new ArrayDeque();
        int[][] swapIndex={{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        queue.offer(initalValue);
        HashSet<String> visited=new HashSet();
        int moves=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-- >0){
                String rem=queue.poll();
                if(rem.equals(solvedPuzzle))return moves;
                int idx=-1;
                for(int i=0;i<rem.length();i++){
                    if(rem.charAt(i)=='0'){
                        idx=i;
                        break;
                    }
                }
                for(int i:swapIndex[idx]){
                    String toBeAdded=swapIndex(rem,idx,i);
                    if(!visited.contains(toBeAdded)){
                        visited.add(toBeAdded);
                        queue.add(toBeAdded);
                    }
                }
            }
            moves++;
        }        
        return -1;
    }
}