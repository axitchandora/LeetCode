class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        char [] parenthesesString=new char[2*n];
        generateValidParenthesesRecursive(n,0,0,parenthesesString,0,result);
        return result;
    }
    private static void generateValidParenthesesRecursive(int num, int openCount, 
      int closeCount, char[] parenthesesString, int index, List<String> result){
        // if we've reached the maximum number of open and close parentheses, add to the result
        if(openCount==num && closeCount==num){
            result.add(new String(parenthesesString));
        }else{
            if(openCount<num){ // if we can add an open parentheses, add it
                parenthesesString[index]='(';
                generateValidParenthesesRecursive(num,openCount+1,closeCount,
                                                  parenthesesString,index+1,result);
            }
            if(openCount>closeCount){ // if we can add a close parentheses, add it
                parenthesesString[index]=')';
                generateValidParenthesesRecursive(num,openCount,closeCount+1,
                                                  parenthesesString,index+1,result);
            }
        }
    }
}