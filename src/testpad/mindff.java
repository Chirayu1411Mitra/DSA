package testpad;

import java.util.ArrayList;

public class mindff {
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
    static void inorder(TreeNode root,ArrayList<Integer>list ){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        int min = 0;
        for(int i : list){
            if(Math.abs(((i+1)-i))<min){
                min=(i+1)-i;
            }
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
