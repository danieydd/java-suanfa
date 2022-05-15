package com.suanfa.demo.temp.leetcode.leetcodebook.primary.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Test03
 * @Description 二叉树遍历
 * @Author danie
 *
 */
public class Test05 {
    //根左右
    private static final List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            TreeNode curr = stack.pop();
            root = curr.right;
        }
        return res;

    }

    //左根右
    private static final List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null ||  !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    //左右根
    private static final List<Integer> postOrder(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null ||  !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.right;
            }
            TreeNode curr = stack.pop();
            root = curr.left;
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(0, node, node2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5, node3, node4);
        List<Integer> res = preOrder(node5);
        System.out.println("preOrder=" + res);
        List<Integer> res2 = inOrder(node5);
        System.out.println("inOrder=" + res2);
        List<Integer> res3 = postOrder(node5);
        System.out.println("postOrder=" + res3);
    }
}
