class Solution {
    public List<String> restoreIpAddresses(String s) {
   List<String>result= new ArrayList<>();
   backtrack(s,0,0,"",result);
   return result;     
    }
    private void backtrack(String s,int index, int parts, String current, List<String>result){
    if(parts==4&&index==s.length()){
        result.add(current.substring(0,current.length()-1));
    }
    if(parts>4){
        return;
    }
    for(int len=1; len<=3&&index+len<=s.length(); len++){
      
        String segment= s.substring(index,index+len );
      //check validity
    if(isValid(segment)){
        backtrack(s,index+len, parts+1,current+segment+".",result);
      
    }

    }
    }
    private boolean isValid(String segment){
        if (segment.length() == 0) return false;
        if(segment.length()>1 &&segment.charAt(0)=='0'){
            return false;
        }
        int num= Integer.parseInt(segment);
        return num>=0&&num<=255;
    }
}