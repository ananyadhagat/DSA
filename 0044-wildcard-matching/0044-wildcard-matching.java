class Solution {
    public boolean isMatch(String s, String p) {
        int i=0;
        int j=0;
        int starindex=-1;
        int matchindex=-1;
         while(i<s.length()){
            if(j<p.length()&&s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j<p.length()&&(p.charAt(j)=='?')){
                    i++;
                    j++;
                }
                else if(j<p.length()&&p.charAt(j)=='*'){
                 starindex=j;
                 matchindex=i;
                 j++;
                }
                else if(starindex!=-1){
                j=starindex+1;
                matchindex++;
                i=matchindex;
                }
                else{
                    return false;
                }
            }
         }
         while(j<p.length() && p.charAt(j)=='*'){
            j++;
         }
         return j==p.length();
    }
}