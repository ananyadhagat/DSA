class Solution {
    public String toLowerCase(String s) {
        String result="";
    StringBuilder sb= new StringBuilder();
       for(int i=0; i<s.length(); i++){
        if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
      char ch=  s.charAt(i);
      char lower= (char)(ch+32);
      sb.append(lower);}
      else{
        sb.append(s.charAt(i));
      }
       } 
       return sb.toString();
    }
}