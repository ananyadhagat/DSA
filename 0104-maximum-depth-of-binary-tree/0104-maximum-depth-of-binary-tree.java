/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
     return dfs(root,0);

    }
    private static int dfs(TreeNode root,int count){
        if(root==null){
            return count;
        }
        count++;
       int left= dfs(root.left,count);
       int right= dfs(root.right,count);
        return Math.max(left,right);
    }
}