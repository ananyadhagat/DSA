class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st= new Stack<>();
        for(int i=0; i<num.length(); i++){
            char ch= num.charAt(i);
         while(!st.isEmpty()&&k>0&&ch<st.peek()){
            st.pop();
            k--;
         }    
        
            st.push(ch);
        
        }
        while(k>0&&!st.isEmpty()){
            st.pop();
            k--;
        }
        char[] arr= new char[st.size()];
        for(int i=arr.length-1; i>=0; i--){
        arr[i]=st.pop();
        }
        String ans= new String(arr);
        int i=0;
        while(i<arr.length&&arr[i]=='0'){
            i++;
        }
        ans=ans.substring(i);

        return ans.isEmpty() ?"0":ans;
    }
}