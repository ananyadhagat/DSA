class Solution {

    public String longestPalindrome(String s) {

        boolean[][] dp = new boolean[s.length()][s.length()];

        String ans = "";

        for(int i = 0; i < s.length(); i++) {

            for(int j = i; j < s.length(); j++) {

                dp[i][j] = solve(s, i, j);

                if(dp[i][j]) {

                    String curr = s.substring(i, j + 1);

                    if(curr.length() > ans.length()) {
                        ans = curr;
                    }
                }
            }
        }

        return ans;
    }

    private boolean solve(String s, int indexi, int indexj) {

        return isPalin(s.substring(indexi, indexj + 1));
    }

    private boolean isPalin(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}