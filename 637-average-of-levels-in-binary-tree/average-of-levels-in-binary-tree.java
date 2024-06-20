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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            double average=0;
            for(int i=0;i<level;i++){
            TreeNode cur=q.poll();
            
            average=average+cur.val;
            if(cur.left!=null){
                q.offer(cur.left);
            }
             if(cur.right!=null){
                q.offer(cur.right);
            }
            }
            average=average/level;
            list.add(average);
        }
        return list;
    }
}