class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
    HashSet<String> set = new HashSet<>();
        for (int[] obs : obstacles) {
            set.add(obs[0] + "," + obs[1]);
        }

        // Directions: North, East, South, West
        int[][] dir = {
            {0, 1},   // North
            {1, 0},   // East
            {0, -1},  // South
            {-1, 0}   // West
        };

        int d = 0; // start facing North
        int x = 0, y = 0;
        int maxDist = 0;

        for (int cmd : commands) {

            if (cmd == -1) {
                // turn right
                d = (d + 1) % 4;

            } else if (cmd == -2) {
                // turn left
                d = (d + 3) % 4;

            } else {
                // move step by step
                for (int i = 0; i < cmd; i++) {

                    int nx = x + dir[d][0];
                    int ny = y + dir[d][1];

                    // stop if obstacle
                    if (set.contains(nx + "," + ny)) {
                        break;
                    }

                    x = nx;
                    y = ny;

                    maxDist = Math.max(maxDist, x * x + y * y);
                }
            }
        }

        return maxDist;
    }
}