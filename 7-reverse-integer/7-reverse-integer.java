class Solution {
    public int reverse(int x) {
        long reverse=0;
        boolean isNegative=false;
        if(x<0) isNegative=true;
        int num=Math.abs(x);
        while(num>0){
            int tmp=num%10;
            num/=10;
            reverse=reverse*10+tmp;
        }
        if(reverse>=Integer.MAX_VALUE) return 0;
        if(isNegative) return -1*(int)reverse;
        else return (int)reverse;
    }
}