class MyStack {
    private Queue<Integer> queue;
    public MyStack() {
        queue= new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int size=queue.size();
        while(size>1){
            int e=queue.poll();
            queue.add(e);
            size--;
        }
        return queue.poll();
    }
    
    public int top() {
        int size=queue.size();
        int e=0;
        while(size>0){
            e=queue.poll();
            queue.add(e);
            size--;
        }  
        return e;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */