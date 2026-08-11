class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
       return solve(nums,n-1,dp);
    }
    private int solve(int []nums,int i,int []dp){
        if(i<0) return 0;
        if (dp[i]!=-1) return dp[i];
      dp[i]=solve(nums,i-1,dp)^nums[i];
      return dp[i];
    }

        
    }
