class Solution {
    public int minimumDeletions(int[] nums) {
        int[] copy= nums.clone();
        Arrays.sort(copy);
        int min=0;
        int max=0;
        
       for(int i=1; i<nums.length; i++){
        if(nums[i]<nums[min]){
            min=i;
        }
        if(nums[i]>nums[max]){
            max=i;
        }
       }
       int front=Math.max(min,max)+1;

       int back=nums.length-Math.min(min,max);

       int both=Math.min(min,max)+1+nums.length-Math.max(min,max);
       return Math.min(front,Math.min(back,both));




    }
}