class Solution {
    public int compress(char[] chars) {
    String s="";
   
    StringBuilder sb= new StringBuilder(s);
    if(chars.length==1){
        sb.append(chars[0]);
        return 1;
    } 
  
    int i=0;
   while(i<chars.length){
char current = chars[i];
int count=1;

        while(i+count<chars.length&&chars[i+count]==current){
            count++;
            
        }
        sb.append(current);
        if(count>1){sb.append(count);}
        i=i+count;}
        for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }
   
    return sb.length();    
    }
}