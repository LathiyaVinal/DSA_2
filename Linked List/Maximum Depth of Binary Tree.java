class Solution {

    public int maxDepth(TreeNode root) {
      
        if(root == null){
          return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode peeked = queue.poll();
                if (peeked.left != null) {
                    queue.add(peeked.left);
                }
                if (peeked.right != null) {
                    queue.add(peeked.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
