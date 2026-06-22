class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map= new HashMap<>();
        for(int i=0; i<text.length(); i++){
            char ch= text.charAt(i);
            if(ch!='b'&&ch!='a' && ch!='l' && ch!='n' && ch!='o') continue;
            
            map.put(ch,map.getOrDefault(ch,0)+1);    
        }
        int[] nums= new int[5];
       nums[0]=map.getOrDefault('b',0);
        nums[1]=map.getOrDefault('a',0);
       nums[2]= map.getOrDefault('l',0)/2;
        nums[3]=map.getOrDefault('o',0)/2;
        nums[4]=map.getOrDefault('n',0);
     
        for(int i=0; i< nums.length; i++){
            if(nums[i]==0) {return 0;}
             else
             Arrays.sort(nums);
           
        }
     return nums[0];
    }
}