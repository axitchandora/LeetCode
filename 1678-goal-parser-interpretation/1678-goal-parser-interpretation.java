class Solution {
    public String interpret(String command) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                result.append("G");
            }else if(i<command.length()-1 && command.charAt(i)=='(' && command.charAt(i+1)==')'){
                result.append("o");
                i++;
            }else{
                result.append("al");
                i+=3;
            }
        }
        return result.toString();
    }
}