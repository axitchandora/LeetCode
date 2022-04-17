class MyQueue {
    
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack();
        s2=new Stack();        
    }
    
    public void push(int x) {
        s1.push(x);
        
    }
    
    public int pop() {
        if(s1.isEmpty()){
            return -1;
        }
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int x;
        x=s2.pop();
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        return x;
    }
    
    public int peek() {
        if(s1.isEmpty()){
            return -1;
        }
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int x;
        x=s2.peek();
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        return x;        
    }
    
    public boolean empty() {
        return s1.isEmpty();        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */