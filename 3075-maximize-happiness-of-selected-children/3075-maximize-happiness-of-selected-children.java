class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Integer[] happi= new Integer[happiness.length];
        for(int i=0;i<happiness.length;i++)
            happi[i]=happiness[i];
        Arrays.sort(happi, Collections.reverseOrder());
        long ans=0;
        for(int i=0;i<k;i++){
            ans += Math.max(happi[i]-i,0); 
        }
        return ans;
    }
}