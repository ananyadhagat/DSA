class Solution {
    int sum;
    public boolean canPartition(int[] nums) {

    for(int i=0; i<nums.length; i++){
        sum=sum+nums[i];}
        if(sum%2!=0){
            return false;
        }
       
            return subsetsum(nums,sum/2);
        
    
       
    }
    private boolean subsetsum(int[] arr, int t){
        int n=arr.length;
        boolean[][] dp = new boolean[n + 1][t + 1];

        for(int i=0; i<n+1; i++){
           
                    dp[i][0]=true;
                
        }
        for(int j=1; j<t+1; j++){
            dp[0][j]=false;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<t+1; j++){
                
                //take
                if(arr[i-1]<=j){
                dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        return dp[n][t];
    }
}