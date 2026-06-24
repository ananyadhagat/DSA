class Solution {
    public int partitionString(String s) {
    HashSet<Character>set= new HashSet<>();
       int i=0;
       int j=0;
       int count=1;
       while(j<s.length()){
        
        
        if(!set.contains(s.charAt(j))){
            set.add(s.charAt(j));
           
            j++;
        }
        else{
            count++;
            set.clear();
            i=j;
        }
       } 
return count;
    }
}