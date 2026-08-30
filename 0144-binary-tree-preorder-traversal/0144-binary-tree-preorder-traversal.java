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
    public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer>pre= new ArrayList<>();
     if(root==null){
        return pre;
     }   
     Deque<TreeNode>stack= new ArrayDeque<>();
     stack.push(root);
     while(!stack.isEmpty()){
        TreeNode curr= stack.pop();
        pre.add(curr.val);
        //right

        if(curr.right!=null){
            stack.push(curr.right);
        }
        if(curr.left!=null){
            stack.push(curr.left);
        }
     }
     return pre;
    }
}