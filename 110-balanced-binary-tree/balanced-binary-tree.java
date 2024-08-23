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
    class BalancedPair{
        boolean isbal=true;
        int ht=-1;
    }
    public boolean isBalanced(TreeNode root) {
        return Balanced(root).isbal;
        
    }
    public BalancedPair Balanced(TreeNode root){
        if(root==null){
            return new BalancedPair();
        }
        BalancedPair lb=Balanced(root.left);
        BalancedPair rb=Balanced(root.right);
        BalancedPair sbp=new BalancedPair();
        sbp.ht=Math.max(lb.ht,rb.ht)+1;
        Boolean sb=Math.abs(lb.ht-rb.ht)<=1;
        sbp.isbal=lb.isbal && rb.isbal && sb;

        return sbp;

    }

}