class Solution {
    public boolean isValid(String s) {
        //Using Stack 
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch== '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if(ch == ')' && !stack.empty() && stack.peek()=='(')
                stack.pop();
            else  if(ch == '}' && !stack.empty() && stack.peek()=='{')
                stack.pop();
            else  if(ch == ']' && !stack.empty() && stack.peek()=='[')
                stack.pop(); 
            else
                return false;
        }
        return stack.empty();
        // Time Complexity -O(N)
        // Space Complexity -O(N)
    }
}