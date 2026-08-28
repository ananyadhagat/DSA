class Solution {
    public boolean isPowerOfFour(int n) {
      return solve(n);
    
    }
    private boolean solve(int n){
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
         if(n%4!=0){
            return false;
        }
       
        return solve(n/4);  
    }
}