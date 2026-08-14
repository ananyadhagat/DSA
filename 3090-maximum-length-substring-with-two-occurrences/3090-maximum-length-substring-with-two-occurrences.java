class Solution {
    public int maximumLengthSubstring(String s) {
       HashMap<Character,Integer>map= new HashMap<>();
       int max=1;
       int j=0;
       for(int i=0; i<s.length(); i++){
        
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        if(map.get(s.charAt(i))<=2){
            max=Math.max(i-j+1,max);
        }
        else{
            while(map.get(s.charAt(i))>2 ){
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;
            }
            max=Math.max(i-j+1,max);
        
        }
       } 
       return max;
    }
}