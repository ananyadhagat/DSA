class Solution {
    long[][] dp;
    List<Integer> slots;

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {

        // sort list properly
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> a[0] - b[0]);

        // flatten factories
        slots = new ArrayList<>();
        for (int[] f : factory) {
            for (int i = 0; i < f[1]; i++) {
                slots.add(f[0]);
            }
        }

        dp = new long[robot.size()][slots.size()];
        for (long[] row : dp) Arrays.fill(row, -1);

        return solve(0, 0, robot);
    }

    private long solve(int i, int j, List<Integer> robot) {

        if (i == robot.size()) return 0;
        if (j == slots.size()) return (long)1e15;

        if (dp[i][j] != -1) return dp[i][j];

        long assign = Math.abs(robot.get(i) - slots.get(j)) 
                      + solve(i + 1, j + 1, robot);

        long skip = solve(i, j + 1, robot);

        return dp[i][j] = Math.min(assign, skip);
    }
}