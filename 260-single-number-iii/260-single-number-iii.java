class Solution {
    public int[] singleNumber(int[] nums) {
        // get the XOR of the all the numbers
        int n1xn2=0;
        for(int num:nums)
            n1xn2 ^=num;
        int rightmostSetBit=1;
        // get the rightmost bit that is '1'
        while((rightmostSetBit & n1xn2)==0 ){
            rightmostSetBit=rightmostSetBit<<1;
        }
        int num1=0,num2=0;
        for(int num:nums){
            if((num & rightmostSetBit)!=0) // the bit is set
                num1 ^=num;
            else // the bit is not set
                num2 ^=num;
        }
        return new int[]{num1,num2};
    }
}