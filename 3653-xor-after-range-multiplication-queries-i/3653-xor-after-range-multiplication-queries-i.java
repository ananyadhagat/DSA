class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1000000007;
        int n = nums.length;
        long[] factor = new long[n];
        
        for (int i = 0; i < n; i++) factor[i] = 1;
        
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];
            for (int idx = l; idx <= r; idx += k) {
                factor[idx] = (factor[idx] * v) % MOD;
            }
        }
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            long val = (nums[i] * factor[i]) % MOD;
            result ^= (int) val;
        }
        
        return result;
    }
}