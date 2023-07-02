package com.company.树;

import com.company.TreeNode;
import sun.misc.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiu
 * @create 2023-06-28 10:45
 */
public class 二叉树的右视图 {
//    广度优先，保存每一层最右边的元素
    public List<Integer> rightSideView(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        queue.addFirst(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.removeLast();
                if (treeNode.left!=null){
                    queue.addFirst(treeNode.left);
                }
                if (treeNode.right!=null) {
                    queue.addFirst(treeNode.right);
                }
                if (i==size-1){
                    res.add(treeNode.val);
                }
            }
        }
        return res;
    }

}
