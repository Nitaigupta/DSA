package Tree;
import java.util.*;

  
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return func(root.left,root.right);
    }
    public boolean func(TreeNode left , TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        boolean l = func(left.left,right.right);
        boolean r = func(left.right,right.left);
        return l&&r;
    }
}