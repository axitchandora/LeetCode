class Solution {
    public int maxDepth(String s) {
        int curr = 0;
        int res = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i)=='(')
                curr++;
            else if(s.charAt(i)==')')
                curr--;
            res= Math.max(curr, res);
        }
        return res;
    }
}