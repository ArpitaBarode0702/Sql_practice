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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Deque<TreeNode> d=new LinkedList<>();
        
        if(root==null){
            return res;    
        }
        d.offer(root);
        boolean reverse=false;
        while(!d.isEmpty()){
            int level=d.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<level;i++){
                if(!reverse){
                    TreeNode cur=d.pollFirst();
                    l.add(cur.val);
                    if(cur.left!=null){
                        d.addLast(cur.left);
                    }
                    if(cur.right!=null){
                        d.addLast(cur.right);
                    }
                }
                else{
                    TreeNode cur=d.pollLast();
                    l.add(cur.val);
                    if(cur.right!=null){
                        d.addFirst(cur.right);
                    }
                    if(cur.left!=null){
                        d.addFirst(cur.left);
                    }
                }
            }
            reverse=!reverse;
            res.add(l);
        }
        return res;
    }
}