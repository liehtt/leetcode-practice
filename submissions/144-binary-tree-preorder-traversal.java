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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if(root != null) {
            list.add(root.val);
            List<Integer> listLeft = new ArrayList<>();
            List<Integer> listRight = new ArrayList<>();
            if(root.left != null) {
                listLeft = preorderTraversal(root.left);
            }

            if(root.right != null) {
                listRight = preorderTraversal(root.right);
            }

            list.addAll(listLeft);
            list.addAll(listRight);

        }
        return list;

    }
}
