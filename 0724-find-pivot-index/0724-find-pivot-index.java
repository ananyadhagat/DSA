class Solution {
    public int pivotIndex(int[] nums) {
      int[] prefix= new int[nums.length];
    prefix[0]= nums[0];
      for(int i=1; i<nums.length; i++){
        prefix[i]=prefix[i-1]+nums[i];
      }
       for(int i=prefix.length-2; i>=0; i--){
        int rightSum= prefix[prefix.length-1]- prefix[i];
       int leftSum= (i==0)?0:prefix[i-1];
       if(leftSum==rightSum){
        return i;
       }
       }
       
       return -1;
    }
}