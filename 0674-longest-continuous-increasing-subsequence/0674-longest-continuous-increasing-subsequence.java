class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int i=0;
        int j=1;
        int ans=1;
        while(i<=j&&i<nums.length&&j<nums.length){
        if(nums[j-1]<nums[j]){
             ans=Math.max(ans,j-i+1);
             j++;
        }
        else{
            i=j;
            j++;
        }
        }
        return ans;
    }
}