class MinStack {
Stack<Integer> stack1;
    Stack<Integer> stack2;
   
    public MinStack() {
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
    }
    
    public void push(int x) {
       stack1.push(x);
        if(stack2.size()==0 || stack2.peek()>=x){
            stack2.push(x);
        }
        
    }
    
    public void pop() {
        if(stack1.size()==0){
            return ;
        }
        int ans=stack1.peek();
        stack1.pop();
        if(ans==stack2.peek()){
            stack2.pop();
        }
      
    }
    
    public int top() {
     return stack1.peek();
    }
    
    public int getMin() {
       
       if(stack2.size()==0){
           return -1;
       }
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */