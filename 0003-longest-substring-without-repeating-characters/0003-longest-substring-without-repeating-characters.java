class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set= new HashSet<>();
        HashMap<Character,Integer>map= new HashMap<>();
        int max=0;
        
        int i=0;
        int j=0;

        while(i<s.length()&& j<s.length() && i<=j){
          set.add(s.charAt(j));
          map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1); 
         
          while((j-i+1)>set.size()){
            
               map.put(s.charAt(i), map.get(s.charAt(i))-1);
                 
               
          
          if(map.get(s.charAt(i))==0){
            map.remove(s.charAt(i));
            set.remove(s.charAt(i));
          }
            i++;
        }
        max=Math.max(max,j-i+1);
             j++;
    }  
     return max;  
    }
}