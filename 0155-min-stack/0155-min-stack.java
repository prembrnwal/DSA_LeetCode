class MinStack {
Stack<Integer> st= new Stack<>();
Stack<Integer> help= new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            help.push(val);
        }
        else{
            st.push(val);
            if(val<help.peek()){
                help.push(val);
            }
            else{
                help.push(help.peek());
            }
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

