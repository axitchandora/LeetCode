class Solution {
    public int[] singleNumber(int[] nums) {
        // get the XOR of the all the numbers
        int n1xn2=0;
        for(int n=0;n<nums.length;n++)
            n1xn2 ^=nums[n];
        int rightmostSetBit=1;
        // get the rightmost bit that is '1'
        while((rightmostSetBit & n1xn2)==0 ){
            rightmostSetBit=rightmostSetBit<<1;
        }
        int num1=0,num2=0;
        for(int n=0;n<nums.length;n++){
            if((nums[n] & rightmostSetBit)!=0) // the bit is set
                num1 ^=nums[n];
            else // the bit is not set
                num2 ^=nums[n];
        }
        return new int[]{num1,num2};
    }
}