class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0, prev=0;
        int curdev;
        for(String row:bank){
            curdev=0;
            for(int i=0;i<row.length();i++){
                if(row.charAt(i)=='1')
                    curdev++;
            }
            if(curdev>0){
                ans+=prev*curdev;
                prev=curdev;
            }            
        }
        return ans;
    }
}