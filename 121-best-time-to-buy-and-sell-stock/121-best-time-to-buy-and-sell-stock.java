class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minprice= Integer.MAX_VALUE;
        for(int i:prices){
            if(minprice>i)
                minprice=i;
            if(i-minprice>0)
                maxprofit=Math.max(i-minprice,maxprofit);
        }
        return maxprofit;
    }
}