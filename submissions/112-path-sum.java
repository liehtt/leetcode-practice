/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {  
        int a = 0;
        if(root != null) {
            a = sum - root.val;
            
            if (root.left == null && root.right == null && a == 0) {
                return true;
            }
            return hasPathSum(root.left, a) || hasPathSum(root.right, a);
           
        }
        
        return false;
        
    }
}
