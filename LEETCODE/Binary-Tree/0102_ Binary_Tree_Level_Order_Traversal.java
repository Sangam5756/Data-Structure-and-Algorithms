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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.remove();
               
                if (curr != null) {
                    currentLevel.add(curr.val);

                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                } else {
                    // Reached the end of the current level
                    if (!q.isEmpty()) {
                        q.add(null);  // Add a level separator for the next level
                    }
                }
            }

            result.add(currentLevel);
        }

        return result;
    }
}
