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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root==null){
            return ll;
        }
        st.push(root);

        while(!st.isEmpty()){
            TreeNode remove = st.peek();
            ll.add(remove.val);
            st.pop();

            if(remove.right!=null){
                st.push(remove.right);
            }
            if(remove.left!=null){
                st.push(remove.left);
            }

        }
        return ll;
        
    }
}