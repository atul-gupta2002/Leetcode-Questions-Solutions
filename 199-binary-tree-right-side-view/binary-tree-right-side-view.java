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
    int visited=-1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightSum(root,result,0);
        return result;       
    }

    public void rightSum(TreeNode root,List<Integer> ll,int curr){
        if(root==null){
            return;
        }
        if(curr>visited){
            ll.add(root.val);
            visited=curr;
        }
        rightSum(root.right,ll,curr+1);
        rightSum(root.left,ll,curr+1);
    }
}