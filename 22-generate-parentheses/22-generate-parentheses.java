class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList();
        Queue<ParenthesesString> queue=new LinkedList();
        queue.add(new ParenthesesString("",0,0));
        while(!queue.isEmpty()){
            ParenthesesString ps=queue.poll();
            // if we've reached the maximum number of open and close parentheses, add to the result
            if(ps.openCount==n && ps.closeCount==n){
                result.add(ps.str);
            }else{
                if(ps.openCount<n){ // if we can add an open parentheses, add it
                    queue.add(new ParenthesesString(ps.str+"(",ps.openCount+1,ps.closeCount));
                }
                if(ps.openCount>ps.closeCount){ // if we can add a close parentheses, add it
                    queue.add(new ParenthesesString(ps.str+")",ps.openCount,ps.closeCount+1));
                }
            }
        }
        return result;
    }
    static class ParenthesesString{
        String str;
        int openCount; // open parentheses count
        int closeCount; // close parentheses count
        public ParenthesesString(String str,int openCount,int closeCount){
            this.str=str;
            this.openCount=openCount;
            this.closeCount=closeCount;
        }
    }
}