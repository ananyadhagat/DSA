class Solution {
     static final long MOD = 1000000007;

    long modPow(long a, long b) {
        long res = 1;
        a %= MOD;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    long modInv(long x) {
        return modPow(x, MOD - 2);
    }
    public int xorAfterQueries(int[] nums, int[][] queries) {
int n = nums.length;
        int T = (int)Math.sqrt(n) + 1;

        List<int[]>[] small = new ArrayList[T];
        for (int i = 0; i < T; i++) small[i] = new ArrayList<>();

        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];
            if (k >= T) {
                for (int i = l; i <= r; i += k) {
                    nums[i] = (int)((nums[i] * 1L * v) % MOD);
                }
            } else {
                small[k].add(q);
            }
        }

        for (int k = 1; k < T; k++) {
            if (small[k].isEmpty()) continue;

            long[] dif = new long[n + k + 2];
            Arrays.fill(dif, 1);

            for (int[] q : small[k]) {
                int l = q[0], r = q[1], v = q[3];

                int last = l + ((r - l) / k) * k;
                int R = last + k;

                dif[l] = (dif[l] * v) % MOD;
                if (R < dif.length) {
                    dif[R] = (dif[R] * modInv(v)) % MOD;
                }
            }

            for (int i = k; i < n; i++) {
                dif[i] = (dif[i] * dif[i - k]) % MOD;
            }

            for (int i = 0; i < n; i++) {
                nums[i] = (int)((nums[i] * dif[i]) % MOD);
            }
        }

        int xor = 0;
        for (int x : nums) xor ^= x;
        return xor;
    }
}

   