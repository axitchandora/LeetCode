class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        // count number of total bits in 'n'
        int bitcount=0;
        int num=n;
        while(num>0){
            bitcount++;
            num=num>>1;
        }
        // for a number which is a complete power of '2' i.e., it can be written as pow(2, n), if we
        // subtract '1' from such a number, we get a number which has 'n' least significant bits set to '1'.
        // For example, '4' which is a complete power of '2', and '3' (which is one less than 4) has a binary 
        // representation of '11' i.e., it has '2' least significant bits set to '1' 
        int all_bits_set=(int) Math.pow(2,bitcount)-1;
        // complement = number ^ all_bits_set
        return n^all_bits_set;
        // Time Complexity - Time complexity of this solution is O(b)
        //where ‘b’ is the number of bits required to store the given number.
        // Space Complexity - O(1)
    }
}