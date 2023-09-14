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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        addToList(result, root);

        return result;
    }

    public void addToList(List<Integer> result, TreeNode root){
        if(root == null)
            return;

        if(root.left != null)
            addToList(result, root.left);
        
        result.add(root.val);
        
        if(root.right != null)
            addToList(result, root.right);
    }
}