class Solution {
    public boolean isMonotonic(int[] nums) {
        int icount=0;
        int dcount=0;
     for(int i=0; i<nums.length-1; i++){
        int j=i+1;
        if(nums[i]<=nums[j]){
         icount++;
        }
        if(nums[i]>=nums[j]){
            dcount++;
        }
     }  
     if(icount==nums.length-1||dcount==nums.length-1) {
        return true;
     }
     return false;
    }
}