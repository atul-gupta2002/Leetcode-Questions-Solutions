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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        TreeNode head = helper(0,nums.length-1,nums);
        return head;
        
    }
    public static TreeNode helper(int start,int end,int[] arr){
        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left=helper(start,mid-1,arr);
        node.right=helper(mid+1,end,arr);
        return node;

    }
}