class Solution {
    public List<String> buildArray(int[] target, int n) {
         List<String> ans = new ArrayList<>();

        int i = 0;

        for (int stream = 1; stream <= n && i < target.length; stream++) {

            if (stream == target[i]) {
                ans.add("Push");
                i++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
        }

        return ans;
    }
}