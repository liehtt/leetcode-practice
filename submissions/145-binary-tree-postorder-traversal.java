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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        
        if (root != null) {
            list.add(root.val);
            
            if (root.left != null) {
                leftList = postorderTraversal(root.left);
            }
            
            if (root.right != null) {
                rightList = postorderTraversal(root.right);
            }
        }
        
        leftList.addAll(rightList);
        leftList.addAll(list);
        
        return leftList;
    }
}
