class Solution {
    public int totalFruit(int[] fruits) {
        int i=0;
     int len=0;
        HashSet<Integer>set= new HashSet<>();
        HashMap<Integer,Integer>map= new HashMap<>();
       for(int j=0; j<fruits.length; j++){
            set.add(fruits[j]);
            map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);
            while(set.size()>2){
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if(map.get(fruits[i])==0){
                    set.remove(fruits[i]);
                    map.remove(fruits[i]);
                }
                i++;
            }
             len=Math.max(len,j-i+1);
           
        }
         return len;
    }
}