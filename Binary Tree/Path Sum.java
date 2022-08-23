// Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
// Output: true
// Explanation: The root-to-leaf path with the target sum is shown.
  
  
  class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, 0, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int sum, int targetSum) {
        if (root == null) {
            return false;
        }

        sum += root.val;

        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }

        return hasPathSum(root.left, sum, targetSum) || hasPathSum(root.right, sum, targetSum);
    }
}
