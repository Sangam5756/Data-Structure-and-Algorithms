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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // return sumOfNode(root, targetSum);
         if(root == null){
                return false;
            }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return ( hasPathSum(root.left , targetSum -root.val )|| hasPathSum(root.right, targetSum - root.val) );
      
    }
    // // Function to sum of nodes
    //     public static boolean sumOfNode( TreeNode root,int target ){

    //         if(root == null){
    //             return false;
    //         }
    //        if (root.left == null && root.right == null) {
    //         return root.val == target;
    //     }
    //     return ( sumOfNode(root.left , target -root.val )|| sumOfNode(root.right, target - root.val) );
               
    //      }

   
    }
