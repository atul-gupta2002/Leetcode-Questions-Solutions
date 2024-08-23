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
    public boolean isBalanced(TreeNode root) {
        return Balanced(root);   
    }

    public boolean Balanced(TreeNode root){
        if(root==null){
            return true;
        }
        boolean leftBal = Balanced(root.left);
        boolean rightBal = Balanced(root.right);

        Boolean selfBal = Math.abs(height(root.left)-height(root.right))<=1;

        return leftBal && rightBal && selfBal;
    }

    public int height(TreeNode root){
        if(root==null){
            return -1;
        }

        int left = height(root.left);
        int right= height(root.right);

        int MaxHeight = Math.max(left,right)+1;

        return MaxHeight;

    }
}