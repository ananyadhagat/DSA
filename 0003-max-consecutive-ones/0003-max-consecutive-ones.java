class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int CurrCount=0;
        int maxCurrCount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
               CurrCount++;
            }
           else{CurrCount=0;}
           maxCurrCount=Math.max(maxCurrCount,CurrCount);
        }
 return maxCurrCount;
    }
}