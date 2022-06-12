class Solution {
    public int arraySign(int[] nums) {
        int countNumberOfNegativeNumber=0;
        for(int i:nums){
            if(i==0)
                return 0;
            else if(i<0){
                countNumberOfNegativeNumber++;
            }
        }          
        if(countNumberOfNegativeNumber%2==0)
            return 1;
        else
            return -1;
    }
}