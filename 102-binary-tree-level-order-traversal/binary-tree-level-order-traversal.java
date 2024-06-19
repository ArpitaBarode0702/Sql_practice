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
    public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> currentlevel=new ArrayList<>();
            
            for(int i=0;i<level;i++){
                TreeNode currentnode=q.poll();
            currentlevel.add(currentnode.val);
                if(currentnode.left!=null){
                    q.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    q.offer(currentnode.right);
                }
            }
            res.add(currentlevel);
        }
        return res;
        
    }
}