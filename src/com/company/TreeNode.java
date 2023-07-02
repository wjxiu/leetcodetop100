package com.company;

/**
 * @author xiu
 * @create 2023-06-27 19:57
 */
public class TreeNode {
   public int val;
   public  TreeNode left;
   public  TreeNode right;
   public  TreeNode() {}
   public  TreeNode(int val) { this.val = val; }
   public  TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

}
