class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st =new Stack<>();
        for(String el : operations){
            switch(el){
                case "+":{
                    int a=st.pop();
                    int b=st.pop();
                    int c=a+b;
                    st.push(b);
                    st.push(a);
                    st.push(c);
                    break;
                }
                case "D":{
                    st.push(2*st.peek());
                    break;
                }
                case "C":{
                    if(!st.isEmpty()) st.pop();
                    break;
                }
                default:{
                     st.push(Integer.parseInt(el));
                    
                }
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum=sum+st.pop();
        }
        return sum;
    }
}