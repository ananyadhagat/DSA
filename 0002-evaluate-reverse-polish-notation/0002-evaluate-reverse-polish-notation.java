class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st= new Stack<>();
        for(int i=0; i<tokens.length; i++){
          String a= tokens[i];
            if(!a.equals("/") && !a.equals("-")  && !a.equals("*") && !a.equals("+")  ){
            st.push(Integer.parseInt(a));
            
        }
            else{
                int p=0;
                 if(!st.isEmpty()){
                    p=st.peek();
                    st.pop();}
                    int q=0;
                    if(!st.isEmpty()){
                     q=st.peek();
                    st.pop();}
                    if(a.equals("/")){
                    int ans= q/p;

                    st.push(ans);
                }
                else if(a.equals("-")){
                    int ans= q-p;
                    st.push(ans);
                }
                else if(a.equals("+")){
                    int ans= q+p;
                    st.push(ans);
                }
                else if(a.equals("*")){
                    int ans= q*p;
                    st.push(ans);
                }
            }
        }
     if(!st.isEmpty()){
         return st.peek();}
         else return 0;
    
    }
}