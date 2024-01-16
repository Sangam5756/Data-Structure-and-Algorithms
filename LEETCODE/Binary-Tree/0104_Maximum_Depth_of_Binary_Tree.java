
class Solution {
    public int maxDepth(TreeNode root) {

        if( root == null){
            return 0;
        }

        int leftHeight = maxDepth(root.left); // check left tree height
        int rightHeight = maxDepth(root.right);//check right tree height

        return Math.max(leftHeight,rightHeight) +1; //add 1 final answer
        
    }
}
