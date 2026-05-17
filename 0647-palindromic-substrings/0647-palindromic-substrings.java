class Solution {
    public int countSubstrings(String s) {
        int n= s.length();
     boolean dp[][]=new boolean[n][n];
     int count=0;
     for(int i=0; i<s.length(); i++){
        for(int j=i; j<s.length(); j++){
            dp[i][j]= isPalin(i, j, s);
            if(dp[i][j]==true){
                count++;
            }
        }

     } 
     return count;
    } 

     private boolean isPalin(int i,int j, String s){
        String news= s.substring(i,j+1);
        int left=0;
        int right=news.length()-1;
        while(left<=right && left<s.length()&& right>=0 ){
            if(news.charAt(right)!=news.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;

     }
    
}