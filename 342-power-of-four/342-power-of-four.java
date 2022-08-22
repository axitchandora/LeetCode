class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0 || n<0) return false;
        
        return (int)(Math.ceil((Math.log(n) / Math.log(4)))) ==
       (int)(Math.floor(((Math.log(n) / Math.log(4)))));
    }
}