class Solution {
    public int lengthOfLastWord(String s) {
       int iterations=0;
       for(int i=s.length()-1; i>=0; i--){
        
        if(s.charAt(i)!=' '){
            iterations++;
        }
        else if(iterations>0){
         break;   
        }
       }
 return iterations;

    }
}



























