class Solution {
    
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;

    for(int i=0; i<nums.length; i++){
        sum+=nums[i];
    }
    if((sum+target)%2!=0 || Math.abs(target)>sum){
        return 0;
    }
    int value=(sum+target)/2;
    return solve(nums,0,value);
       
    }
    private int solve(int[] nums, int index, int target){
       
    if(index==nums.length){
       return target == 0 ? 1 : 0;
    }
    int notTake= solve(nums, index+1, target);
    int take=0;
    if(nums[index]<=target){
        take=solve(nums,index+1,target-nums[index]);
         
    }
     return take + notTake;
    }
}