class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st =new Stack<>();
        int n =tokens.length;
        for(String el : tokens){
            switch(el){
                case "+":{
                    st.push(st.pop()+st.pop());
                    break;
                }
                case "-":{
                    int first=st.pop();
                    st.push(st.pop()-first);
                    break;
                }
                case "*":{
                    st.push(st.pop() * st.pop());
                    break;
                }
                case "/":{
                    int one=st.pop();
                    st.push(st.pop()/one);
                    break;
                }

                default:{
                    st.push(Integer.parseInt(el));
                }
            }
        }
        return st.pop();
        
    }
}