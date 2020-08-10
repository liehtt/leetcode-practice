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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList= new ArrayList<>();
        
        if(root != null) {
            list.add(root.val);
            
            if(root.left != null) {
                leftList = inorderTraversal(root.left);
            }
            
            if(root.right != null) {
                rightList = inorderTraversal(root.right);
            }
            
        }
        
        leftList.addAll(list);
        leftList.addAll(rightList);
        
        return leftList;
    }
}
