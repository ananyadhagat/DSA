class Solution {
    public int minOperations(int[] nums, int x) {
      int left=0;
      int right=0;
      int total=0;
      int count=Integer.MIN_VALUE;
      for(int i=0; i<nums.length; i++){
        total+=nums[i];
      }
      int sum=0;
      int req= total-x;
      while(right<nums.length){
       sum+=nums[right]; 
       
       while(sum>req&& left<right){
        sum=sum-nums[left];
       left++;
       
       }
       if(sum==req){
        count=Math.max(count,right-left+1);
      
       }
       right++;
      }
     int result = (count==Integer.MIN_VALUE) ? -1 :nums.length-count ;

 return result;

    }
}