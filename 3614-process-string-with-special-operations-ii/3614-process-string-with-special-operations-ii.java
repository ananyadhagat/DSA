class Solution {
    public char processStr(String s, long k) {

        int n = s.length();
        long[] len = new long[n];

        long cur = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                cur++;
            } else if (ch == '*') {
                if (cur > 0) cur--;
            } else if (ch == '#') {
                cur *= 2;
            } else if (ch == '%') {
                // length unchanged
            }

            len[i] = cur;
        }

        if (k >= cur) return '.';

        for (int i = n - 1; i >= 0; i--) {

            char ch = s.charAt(i);
            long prev = (i == 0) ? 0 : len[i - 1];

            if (ch >= 'a' && ch <= 'z') {

                if (k == prev) {
                    return ch;
                }

            } 
            else if (ch == '#') {

                k %= prev;

            } 
            else if (ch == '%') {

                k = len[i] - 1 - k;

            } 
            else { // '*'

                // nothing to do
                // current index maps to same index in previous string
            }
        }

        return '.';
    }
}