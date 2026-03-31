class Solution {
    public boolean validPalindrome(String s) {
      return deletion(s, 0, s.length()-1,false);   
    }
    private boolean deletion(String s, int i, int j, boolean deleted){
        //base case
        if(i>=j){
            return true;
        }
    if(s.charAt(i)==s.charAt(j)){
        return deletion(s,i+1,j-1,deleted);
    }

    if(deleted) return false;
       
    //delete once
    return deletion(s, i+1,j,true)||deletion(s,i,j-1,true);
    }
    
}