package com.company.树;

import com.company.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-07-26 12:12
 */
public class 二叉树展开为链表 {
    public static void main(String[] args) {
        int[] ints = {30, 40, 60, 30, 20, 50};
        new 二叉树展开为链表().quicksort(ints, 0, 5);
        System.out.println(Arrays.toString(ints));
    }

    ArrayList<TreeNode> arr = new ArrayList<TreeNode>();

    public void flatten(TreeNode root) {
        for (int i = 1; i < arr.size(); i++) {
            TreeNode cur = arr.get(i - 1);
            TreeNode nxt = arr.get(i);
            cur.left = null;
            cur.right = nxt;
        }
    }

    void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        arr.add(root);
        preorder(root.left);
        preorder(root.right);
    }

    public void quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int i, j;
            i = left;
            j = right;
            int x = arr[i];
            while (i < j) {
                while (i < j && arr[j] >= x) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && arr[i] <= x) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = x;
            quicksort(arr, left, i - 1);
            quicksort(arr, i + 1, right);
        }

    }
}
