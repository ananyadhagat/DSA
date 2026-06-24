class Solution {
    public int minimumCardPickup(int[] cards) {
        int min=Integer.MAX_VALUE;
        int i=0; 
        int j=0;
        HashMap<Integer,Integer>map= new HashMap<>();
        while(i<=j && i<cards.length &&j<cards.length){
            if(!map.containsKey(cards[j])){
                map.put(cards[j],map.getOrDefault(cards[j],0)+1);
               
                j++;
            }
            else if(map.get(cards[j])<2){
                map.put(cards[j],map.getOrDefault(cards[j],0)+1);
               
              
            
            
                while(map.get(cards[j])>=2){
                    min=Math.min(j-i+1, min);
                    map.put(cards[i], map.get(cards[i])-1);
                    i++;
                }
                j++;
            }
          
        }
       if(min!=Integer.MAX_VALUE){
        return min;
       }
       else return -1;
    }
}