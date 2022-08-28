class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;
        
        if(root.val < low) return trimBST(root.right, low, high);
        if(root.val > high) return trimBST(root.left, low, high);
        
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        
        return root;
    }
  
}


/////////// SECOND WAY ///////////////////


class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return removeElement(root, low, high);
    }
  
    public TreeNode removeElement(TreeNode root, int low, int high){
      if(root == null){
        return null;
      }
      
      root.left = removeElement(root.left, low, high);
      root.right = removeElement(root.right, low, high);
      
      if(root.val < low){
          return root.right;
      }
      else if(root.val > high){
          return root.left;
      }
      return root;
    }
}
