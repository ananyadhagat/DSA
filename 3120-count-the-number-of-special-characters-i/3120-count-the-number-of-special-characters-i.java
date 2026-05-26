class Solution {
    public int numberOfSpecialChars(String word) {
     HashMap<Character,Integer>map1= new HashMap<>();
      HashMap<Character,Integer>map2= new HashMap<>();
      int count=0;
     for(int i=0; i<word.length(); i++){
       if(word.charAt(i)>='a'&&word.charAt(i)<='z'){ map1.put(word.charAt(i), map1.getOrDefault( word.charAt(i),0)+1);
       }
        else if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){ map2.put(word.charAt(i), map2.getOrDefault( word.charAt(i),0)+1);
       }
     } 
     for(Character key:map1.keySet()){
        if(map2.containsKey(Character.toUpperCase(key))){
            count++;
        }
     }
     return count;
    }
}