package com.company.树;

import com.company.TreeNode;
import sun.reflect.generics.tree.Tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiu
 * @create 2023-06-27 19:56
 */
public class 中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> treeNodes = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty()||root!=null){
            while (root!=null){
                stack.add(root);
                root=root.left;
            }
            root= stack.pop();
            treeNodes.add(root.val);
            root=root.right;
        }
        return treeNodes;
    }
}
