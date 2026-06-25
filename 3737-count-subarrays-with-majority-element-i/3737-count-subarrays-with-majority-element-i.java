class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        int ans=0;
     for(int i=0; i<nums.length; i++){
        for(int j=i; j<nums.length; j++){
            if(nums[j]==target){count++;
            }
            float val=(float)count/(j-i+1);
            if( val>0.5){
                ans++;
            }
        
        }
        count=0;
     } 
     return ans;  
    }
}