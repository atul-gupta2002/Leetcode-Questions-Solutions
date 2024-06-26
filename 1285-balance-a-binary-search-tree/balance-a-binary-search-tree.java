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
    ArrayList<TreeNode>list;
    // public Solution() {
    //    list = new ArrayList<>();
    // }
    public TreeNode balanceBST(TreeNode root) {
        list=new ArrayList<>();
        inorder(root);
        return recursive(0,list.size()-1);       
    }
    public TreeNode recursive(int l,int h){
        if(l>h){
            return null;
        }
        int mid=(l+h)/2;
        TreeNode head=list.get(mid);
        head.left=recursive(l,mid-1);
        head.right=recursive(mid+1,h);
        return head;
        
    }
    public void inorder(TreeNode root){
        if(root==null)  return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
}