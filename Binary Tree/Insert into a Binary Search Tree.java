class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode nodeToInsert = new TreeNode(val);

        TreeNode node = root;

        if (node == null) {
            node = nodeToInsert;
            return node;
        }

        while (true) {
            if (node.val > val) {
                if (node.left == null) {
                    node.left = nodeToInsert;
                    break;
                } else {
                    node = node.left;
                }
            } else {
                if (node.right == null) {
                    node.right = nodeToInsert;
                    break;
                } else {
                    node = node.right;
                }
            }
        }

        return root;
    }
}
