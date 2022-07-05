class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] diffOfInAndOutDegree=new int[n+1];
        for(int[] t:trust){
            diffOfInAndOutDegree[t[0]]--;
            diffOfInAndOutDegree[t[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(diffOfInAndOutDegree[i]==n-1)
                return i;
        }
        return -1;
    }
    // Time Complexity - O(N)
    // Space Complexity - O(N)
}