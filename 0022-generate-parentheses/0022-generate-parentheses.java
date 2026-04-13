class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result= new ArrayList<>();
        List<String>current=new ArrayList<>();
        backtrack(n,0,0,result,"");
        return result;
    }
    private void backtrack(int n,int close, int open, List<String>result,String current){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(open<n){
           
            backtrack(n,close, open+1,result, current+"(");
        }
        if(close<open){
         
            backtrack(n,close+1, open,result, current+")");
        }
    }
}