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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        find(root,x);
        int lc=countNode(p.left);
        int rc=countNode(p.right);
        return Math.max(lc,Math.max(rc,n-lc-rc-1))>n/2;
        
    }
    TreeNode p=null;
    public int countNode(TreeNode root){
        if(root==null){
            return 0;
        }
        int l= countNode(root.left);
        int r= countNode(root.right);

        return l+r+1;  
    }

    public void find(TreeNode root,int x){
        if(root==null || p!=null){
            return;
        }
        if(root.val==x){
            p=root;
        }
        find(root.left,x);
        find(root.right,x);
         
    }
}