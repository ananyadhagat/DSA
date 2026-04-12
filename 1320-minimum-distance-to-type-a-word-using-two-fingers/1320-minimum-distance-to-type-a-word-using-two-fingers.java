class Solution {
    public int minimumDistance(String word) {
      int n = word.length();
        int[][] dist = new int[26][26];
        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                dist[i][j] = getDist(i, j);
            }
        }

        int[] dp = new int[26];
        int total = 0;

        for (int i = 0; i < n - 1; i++) {
            int curr = word.charAt(i) - 'A';
            int next = word.charAt(i + 1) - 'A';

            int d = dist[curr][next];
            total += d;

            int[] newDp = dp.clone();  // ✅ FIX

            for (int j = 0; j < 26; j++) {
                // move second finger from j → next
                newDp[curr] = Math.max(newDp[curr], dp[j] + d - dist[j][next]);
            }

            dp = newDp;
        }

        int maxSave = 0;
        for (int x : dp) {
            maxSave = Math.max(maxSave, x);
        }

        return total - maxSave;
    }

    private int getDist(int a, int b) {
        int x1 = a / 6, y1 = a % 6;
        int x2 = b / 6, y2 = b % 6;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
    
} 