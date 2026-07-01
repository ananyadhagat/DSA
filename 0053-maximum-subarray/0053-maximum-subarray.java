class Solution {
    public int maxSubArray(int[] nums) {
     
        long maxi = Long.MIN_VALUE; 
        
       
        long sum = 0; 
        
       
        for (int i = 0; i < nums.length; i++) {
            
            
            sum += nums[i]; 
            
            // Update maxi if current sum is greater
            if (sum > maxi) {
                maxi = sum; 
            }
            
            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0; 
            }
        }
        
        // Return the maximum subarray sum found
        return (int) maxi;  
    }
}