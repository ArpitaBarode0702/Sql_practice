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
    int length=0;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lefthight=maxDepth(root.left);
        int righthight=maxDepth(root.right);
        return Math.max(lefthight,righthight)+1;
        
    }
}