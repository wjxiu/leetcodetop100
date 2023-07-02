package com.company.树;

import com.company.TreeNode;

import java.util.HashMap;

/**
 * @author xiu
 * @create 2023-06-29 10:38
 */
public class 重建二叉树 {
//    保存中序的
    HashMap<Integer,Integer> dict= new HashMap<Integer,Integer>();
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            dict.put(inorder[i],i);
        }
        this.preorder=preorder;
      return recur(0,0, preorder.length-1);
    }
    TreeNode recur(int root, int left,int right){
        if (left>right) return null;
        int i =dict.get(preorder[root]);
        TreeNode treeNode = new TreeNode(preorder[root]);
        treeNode.left=  recur(root+1,left,i-1);
        treeNode.right=  recur(i-left+root+1,i+1,right);
        return treeNode;
    }
}
