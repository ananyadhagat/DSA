class Solution {
    public boolean isPowerOfThree(int n) {
  return solve(n);
    
    }
    private boolean solve(int n){
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
         if(n%3!=0){
            return false;
        }
       
        return solve(n/3);
    }
}

//true -> n =3^x
//base- 