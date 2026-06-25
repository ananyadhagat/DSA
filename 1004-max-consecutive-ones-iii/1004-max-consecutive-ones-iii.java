class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int sublength=0;
        int zeroCount=0;
      TreeSet<Integer> set=new TreeSet<>(); 
     for(int i=0; i<nums.length; i++){
       if(nums[i]==0){
        set.add(i);
        zeroCount++;
        if(zeroCount>k) {
           
            int min=set.first();
            set.remove(min);
             left=min+1;
             zeroCount--;
        }
       }  
        sublength= Math.max(sublength, i-left+1);
    }
    return sublength;
}
}