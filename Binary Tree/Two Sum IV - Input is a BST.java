Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.

Input: root = [5,3,6,2,4,null,7], k = 9
Output: true


class Solution {
    public boolean findTarget(TreeNode root, int k) {
      
      Set<Integer> set = new HashSet<>();
      
      return findTarget(set, root, k);
    }
  
  public boolean findTarget(Set<Integer> set, TreeNode root, int k){
    if(root == null){
      return false;
      
    }
    
    if(set.contains(k - root.val)){
      return true;
    }
    
    set.add(root.val);
    
    if(findTarget(set, root.left, k)){
      return true;
    }
    
    if(findTarget(set, root.right, k)){
      return true;
    }
    
    return false;
  }
}
