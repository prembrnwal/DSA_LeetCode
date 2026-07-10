class MinStack {
Stack<Integer> st= new Stack<>();
Stack<Integer> help= new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st. push(val);
            help.push(val);
        }
        else{
            st.push(val);
            if(val<help.peek()){
                help.push(st.peek());
            }
            else{
                help.push(help.peek());
            }
            // if(help.peek()<val) help.push(help.peek());
            // else help.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        help.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return help.peek();
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