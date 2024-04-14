class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int sum=0;

    if (root.left != null && root.left.left == null && root.left.right == null) {
            // If so, add its value to the sum
            sum += root.left.val;
        }
        
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
